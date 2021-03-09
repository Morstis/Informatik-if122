package Kryptoanalyse;

import java.util.Scanner;

import Menge.Menge;

public class Kryptoanalyse {

    public Liste<String> text = new Liste<String>();

    // Menge, um Dopplungen zu vermeiden;
    private Liste<String> possibilities = new Liste<String>();

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
            // Ausgesprochen entel
            String ntl = "";
            for (int j = 0; j < n; j++) {
                ntl += textarray[i + j];
            }
            this.possibilities.addIfNotIn(ntl);
            this.text.add(ntl);

        }

        Liste<NamePosition> pos = calcAllDistances();

        Liste<EntfernungHaef> alleEntfs = new Liste<EntfernungHaef>();

        for (int i = 0; i < pos.length; i++) {
            NamePosition elem = pos.get(i);
            Liste<Integer> elemEntfs = elem.calcEntfs();
            for (int j = 0; j < elemEntfs.length; j++) {
                int entfernung = elemEntfs.get(j);

                if (i == 0) {
                    alleEntfs.addIfNotIn(new EntfernungHaef(entfernung));

                } else {

                    EntfernungHaef entfh = alleEntfs.get(j);
                    if (entfh.entfernung == entfernung) {
                        entfh.increase();
                        alleEntfs.replace(j, entfh);
                        break;
                    } else {
                        alleEntfs.addIfNotIn(new EntfernungHaef(entfernung));
                    }

                }

            }
            // System.out.println(elem.name + "\t" + elem.positions + "\t" + elemEntfs);

        }
        System.out.println(alleEntfs);

        for (int i = 0; i < alleEntfs.length; i++) {
            System.out.println(alleEntfs.get(i));

        }

    }

    public Liste<NamePosition> calcAllDistances() {
        Liste<NamePosition> namePositions = new Liste<NamePosition>();
        for (int i = 0; i < possibilities.length; i++) {
            String searchString = this.possibilities.get(i);
            Liste<Integer> indexes = this.text.getIndexesofData(searchString);
            if (indexes.length > 1) {
                namePositions.add(new NamePosition(searchString, indexes));
            }
        }

        return namePositions;
    }

}
