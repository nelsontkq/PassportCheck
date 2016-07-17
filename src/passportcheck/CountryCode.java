/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passportcheck;

/**
 *
 * @author ntko
 */
public class CountryCode {
    public String toCode(int countryIndex) {
        String[] countryCode = {"AFG", "ALB", "DZA", "ASM", "AND", "AGO", "AIA",
            "ATA", "ATG", "ARG", "ARM", "ABW", "AUS", "AUT", "AZE", "BHS", "BHR",
            "BGD", "BRB", "BLR", "BEL", "BLZ", "BEN", "BMU", "BTN", "BOL", "BIH",
            "BWA", "BVT", "BRA", "IOT", "BRN", "BGR", "BFA", "BDI", "KHM", "CMR",
            "CAN", "CPV", "CYM", "CAF", "TCD", "CHL", "CHN", "CXR", "CCK", "COL",
            "COM", "COG", "COK", "CRI", "CIV", "HRV", "CUB", "CYP", "CZE", "PRK",
            "COD", "DNK", "DJI", "DMA", "DOM", "TMP", "ECU", "EGY", "SLV", "GNQ",
            "ERI", "EST", "ETH", "FLK", "FRO", "FJI", "FIN", "FRA", "FXX", "GUF",
            "PYF", "GAB", "GMB", "GEO", "D<<", "GHA", "GIB", "GRC", "GRL", "GRD",
            "GLP", "GUM", "GTM", "GIN", "GNB", "GUY", "HTI", "HMD", "VAT", "HND",
            "HKG", "HUN", "ISL", "IND", "IDN", "IRN", "IRQ", "IRL", "ISR", "ITA",
            "JAM", "JPN", "JOR", "KAZ", "KEN", "KIR", "KWT", "KGZ", "LAO", "LVA",
            "LBN", "LSO", "LBR", "LBY", "LIE", "LTU", "LUX", "MDG", "MWI", "MYS",
            "MDV", "MLI", "MLT", "MHL", "MTQ", "MRT", "MUS", "MYT", "MEX", "FSM",
            "MCO", "MNG", "MSR", "MAR", "MOZ", "MMR", "NAM", "NRU", "NPL", "NLD",
            "ANT", "NTZ", "NCL", "NZL", "NIC", "NER", "NGA", "NIU", "NFK", "MNP",
            "NOR", "OMN", "PAK", "PLW", "PAN", "PNG", "PRY", "PER", "PHL", "PCN",
            "POL", "PRT", "PRI", "QAT", "KOR", "MDA", "REU", "ROM", "RUS", "RWA",
            "SHN", "KNA", "LCA", "SPM", "VCT", "WSM", "SMR", "STP", "SAU", "SEN",
            "SYC", "SLE", "SGP", "SVK", "SVN", "SLB", "SOM", "ZAF", "SGS", "ESP",
            "LKA", "SDN", "SUR", "SJM", "SWZ", "SWE", "CHE", "SYR", "TWN", "TJK",
            "THA", "MKD", "TGO", "TKL", "TON", "TTO", "TUN", "TUR", "TKM", "TCA",
            "TUV", "UGA", "UKR", "ARE", "GBR", "GBD", "GBN", "GBO", "GBP", "GBS",
            "TZA", "USA", "UMI", "URY", "UZB", "VUT", "VEN", "VNM", "VGB", "VIR",
            "WLF", "ESH", "YEM", "ZAR", "ZMB", "ZWE"};
        
        return countryCode[countryIndex];
    }
}
