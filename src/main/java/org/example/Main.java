package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariOptions;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        ChromeOptions options = new ChromeOptions();
        //        ChromeOptions options = new ChromeOptions();
        SafariOptions options = new SafariOptions();
        options.setBrowserVersion("16"); // Đặt phiên bản trình duyệt (nếu cần)

//        WebDriver driver = new SafariDriver(options); // Khởi tạo WebDriver với SafariOptions
        driver.get("https://www.google.com");
        driver.get("https://kaopizvn-my.sharepoint.com/:p:/g/personal/dinhpx_kaopiz_com/EQI7k5RmW99LioOE4wD8xdgBSj57hRVzzDgR6cjbj49Wfw?wdOrigin=TEAMS-WEB.p2p_ns.rwc&wdExp=TEAMS-TREATMENT&wdhostclicktime=1742469040767&web=1");
    }
}