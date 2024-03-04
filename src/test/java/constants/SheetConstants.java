package constants;

public class SheetConstants {

    public static final String loginSheetPath = "\\data\\credentials\\credentials.xlsx";
    public static final String frameworkConfigSheetPath = "\\data\\credentials\\frameworkconfig.xlsx";
    public static final String sheetNameForCredentials = "credentials";
    public static final String sheetNameForFrameworkConfig = "frameworkconfig";


    //List of column Labels
    public static final String columnForBrowser = "BROWSER";
    public static final String columnForTestEnv = "ENV_TEST";
    public static final String columnForURL = "URL";
    public static final String columnForRole = "ROLE";
    public static final String columnForTestEmail = "TEST_EMAIL";
    public static final String columnForTestPassword = "TEST_PASSWORD";


    // List of row numbers for each data
    public static final int browserRowNumber = 2;
    public static final int envRowNumber = 2;

    public static final int role_admin_credentials_rowNumber = 2;
    public static final int role_manager_credentials_rowNumber = 3;

    public static final String KONA_EU="https://daf.perfitcomputer.com/kona_eu/faces/index.jsf";
    public static final String Kona_EC =" https://www.emdecs.com/kona/faces/signin/signin.jsf";
    public static final String KONA_NA="https://daf.perfitcomputer.com/kona_na/faces/index.jsf";


}
