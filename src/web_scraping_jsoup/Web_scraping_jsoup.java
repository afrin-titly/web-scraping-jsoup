/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_scraping_jsoup;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author afrin
 */
public class Web_scraping_jsoup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Document document = (Document) Jsoup.connect("https://www.google.com/search?q=jsoup+tutorial&oq=jsoup+tutorial&gs_l=psy-ab.3..35i39k1j0l3.374223.383020.0.384852.20.17.0.0.0.0.567.567.5-1.1.0....0...1.1.64.psy-ab..19.1.566.wuwQC0FwYCw").timeout(6000).get();
        Elements elem = document.select("div.g");
        for(Element element:elem){
           System.out.println(element.select("h3").text());
           System.out.println(element.select("a").attr("href"));           
        }
    }
    
}
