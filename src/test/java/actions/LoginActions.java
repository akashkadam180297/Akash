package actions;

import constants.SheetConstants;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tests.TestDriverActions;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.Properties;

public class LoginActions extends TestDriverActions {

    public static String environmentName = System.getProperty("env","QA");

    public String getAppUrl() throws IOException {

        String appUrl = null;

        appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForFrameworkConfig, SheetConstants.columnForTestEnv, SheetConstants.envRowNumber);


    /*    if (System.getProperty("env").equalsIgnoreCase("TEST")) {

            appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEnv, SheetConstants.envRowNumber);


        } else if (System.getProperty("env").equalsIgnoreCase("QA")) {
            //appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForEmail, SheetConstants.role_admin_credentials_rowNumber);


        } else if (System.getProperty("env").equalsIgnoreCase("FXG")) {
            //appUrl = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForEmail, SheetConstants.role_admin_credentials_rowNumber);

        }*/

        return appUrl;
    }
   /** new metnod Akash*/
    public String getAppUrl1(@org.jetbrains.annotations.NotNull String className) throws IOException {     //Method to get Url from commomd line
        String appUrl = null;
        String configFileName = System.getProperty("user.dir")+"/src/test/java/utils"+"/"+className.toLowerCase()+"/"+className.toLowerCase()+"%s.properties";
         configFileName= String.format(configFileName,LoginActions.environmentName);
           System.out.println(" configFileName :: " + configFileName);
           appProp = new Properties();
        appProp.load(new FileInputStream(new File(configFileName)));
        appUrl=appProp.getProperty("url");

        return  appUrl;
    }
    public String[] getUserCredentials() throws IOException {

        String userRole = System.getProperty("role");
        String[] credentials = new String[2];

        credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);
        credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestPassword, SheetConstants.role_manager_credentials_rowNumber);

/*
        if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("ADMIN")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestPassword, SheetConstants.role_admin_credentials_rowNumber);

        } else if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("MANAGER")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_manager_credentials_rowNumber);

        } else if (System.getProperty("env").equalsIgnoreCase("TEST") && userRole.equalsIgnoreCase("PFUSER")) {
            credentials[0] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);
            credentials[1] = DataActions.getReuseActions().getCellData(SheetConstants.loginSheetPath, SheetConstants.sheetNameForCredentials, SheetConstants.columnForTestEmail, SheetConstants.role_admin_credentials_rowNumber);


        }*/

        return credentials;

    }

    }

