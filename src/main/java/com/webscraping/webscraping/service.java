package com.webscraping.webscraping;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class service {

  //  String url="https://www.flipkart.com/search?q=phone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";
    String url="https://www.cricbuzz.com/live-cricket-scores/76955/sys-vs-brh-qualifier-big-bash-league-2023-24";
    public Map<String, String>  extractData(){
//        try {
//            Map<String,String>productInfo= new HashMap<>();
//          //  List<String>productInfo=new ArrayList<>();
//            Document document = Jsoup.connect(url).get();
//            Elements product = document.select("._2kHMtA");
//            for (Element pd:product) {
//                String prodName = pd.select("._4rR01T").text();
//                String price = pd.select("._30jeq3").text();
//                productInfo.put(prodName,price);
//            }
//            return productInfo;
//           // return productInfo;
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
        try {
            Map<String,String>productInfo= new HashMap<>();
          //  List<String>productInfo=new ArrayList<>();
            Document document = Jsoup.connect(url).get();
            Elements product = document.select(".cb-comm-pg");
            for (Element pd:product) {
                String overNum = pd.select(".cb-ovr-num").text();
                String price = pd.select(".cb-com-ln").text();
                productInfo.put(overNum,price);
            }
            return productInfo;
           // return productInfo;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
