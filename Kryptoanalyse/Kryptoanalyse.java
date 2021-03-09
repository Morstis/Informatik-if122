package Kryptoanalyse;

import java.util.Scanner;

import Menge.Menge;

public class Kryptoanalyse {

    public Liste<Zahl> text = new Liste<Zahl>();

    // Menge, um Dopplungen zu vermeiden;
    private Menge<String> possibilities = new Menge<String>();

    Kryptoanalyse() {
        Scanner lies = new Scanner(System.in);

        System.out.print("Geheimtext: ");
        // String input = lies.next();
        String input = "DUI SJCPFSTGKIQ MAL IIZI EAWSQRAULARX, LAI SUGP EMT PIZ NIREGPDüWSQPCFK UZH MFXSOLTüKWEXYVY ZOZ MVXSRYEBASNQR CFH SAQQL QIF HMJ MNRSZEETUSVKWIOLMJLEUX JWWCTäJBAKT. NMA ARS ETäBW 20. NATVPMRDQVB OERQR DWVSOLTüKWEXYVYWVQVNSLRQR LWV EURHAKE GRBWVSGGPMRGEKMYINEXIFH. MUX LWV EFEJDMEDYVY HEE ITWOTDSVAWCTIV VETQRDWVKQLZK OAYIV OIIFIZW FEDIQULE TMVRY.DMDC RäLLQR LAKIFETW WISRILYRQR, QVINFMNAOAFMWFWPDSBGOOXPM, CVYBXWYVARMAULE TEAZJUZOBASNQR, OWLEUQVAWTQMTMRG, QPMCXRARQKGHQ AIZPVQVNSLRQR CFH EXISLVOZMAULEE KMDH. HQYBW MSF HQW ORKTBGPOSMM AR DUI NSGHSIJAITQ WGEQEFVQKGHQ OZQTTAKZSTHUI, XMFLUG-SWC-KDCXLSGDEXZME, TEZVAADISJCPFSOJEPTMM MRD FLMGVEFMAULE WVGHXOXSOAI UZXMJXEUPB. VME WVGHXOXSOAI LäEWB KMCT ECUL IZ HQW FEUHMF KENMMLI KDCXLSGDEXZME (MYKZ: ORKTBGKRMJQW), HIQ ZMJWCTPüAKILGRO NSN URNGVMMXQGREZ, YVV ORKTBGENMPGKI (MAHMJREDI AULRQMJOIIEI IMGH: WVGHXAZETQWE), PMM ARFAVUSXIARAYIWURVMRG MYA NIREGPDüWSQPBWR IZJWJQAFMWFIN, GRBWVTQMTWR. DUIAW IIZXMAPUZK MFXWUGSWPTQ HMJ VUEWQKGH-MQMJMKMRQKGHQ OZQTTAPWYI WUPTAEM RVQWHMMR MFHE PIA WVSFIV OILFOZAIGQW. DGR ITQ ALEMYIV KSWALT VME NIOJMFRWLWJIZMBASNQR EAI AGGP VME MFOJINLYVY YNFIZWMNMRLWV. DQQ NGPGQRL TISOLäNLMGF WQUL DUI SJCPFSOJEPTMM EMT PIZ WRTIMKCPUZK CFH AZAMFHUZK LWV EURHWPNQR DWVFMLZWR UZH LAI KDCXLSAZETQWE YMB VIRQR ALäVKQR CFH SOLEäULEZ. EVVIRE JWJQUXMMJX, BQJIKWT EMKZ HIQ OZQTTAKZSTHUI UAX DQV AAGHQVPWMT PIZ WMGQRMF KETIQEIN WSUEYNUOILMOZ MVKFEESVVIRQ KMYIN GRJWJUSXM WRTLMNXIRGRO GHED ZMJäRDQVCFK, WäTVMFH DUI SJCPFSIFELKWM, IYAEM IDW GQKMFWPUITWVIZ HMJ ORKTBGKRMTPAI, DMW JJICTIV VIR EMKZIRTIQL HED OWEQUZMSSXIAR HMQ ZUIT ZET. WVGHXOSVIHLIQ YVV ORKTBGENMPGKI WQVLWR DMLMJ EUOL IDW DQJMFWIHI CFH ORJMFWIHI SJCPFSTGKIQ FMRIIOLVWX. DQV LSQIF ZMJFUZHMFIN NIAULRäZOCFK DQW JWKRUJNK ORKTBGKRMTPAI WUVL SPLQVLARGE RQULT UQUWV RQGPFYNS KMLVASIV. NMEXQMZV WQVLWR DUI JWKRUJNW ORKTBGPOSMM MRD WVGHXOSVIHLIQ DCOIIXIV YPEUGPTIRQGPLMGF ZMJAEZHML.";

        // Löscht die Leerzeichen und Sonderzeichen und speichert den String als char
        // Array ab. Schreibt außerdem alles groß.

        char[] textarray = input.toUpperCase().replaceAll("[ $&+,:;=?@#|'<>.^*()%!-]", "").toCharArray();

        System.out.print("N-Gramm, N: ");
        int n = lies.nextInt();

        for (int i = 0; i < textarray.length - n; i++) {
            String possibility = "";
            for (int j = 0; j < n; j++) {
                possibility += textarray[i + j];
            }
            this.possibilities.add(possibility);
        }
        System.out.println(this.possibilities);

    }

    public int[] calcAllDistances() {

        return null;
    }

}
