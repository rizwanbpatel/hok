/*
package com.company.parser;

import com.company.parser.gen.DataExchangeOutput;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

final class XMLParse {

    public static void main(String[] args) throws JAXBException, IOException {
//        try {
//            domParse();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        } catch (org.xml.sax.SAXException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            saxParse();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (org.xml.sax.SAXException e) {
//            e.printStackTrace();
//        }

        jaxbParse();

    }

    public static void domParse() throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        File file = new File("C:\\codelab\\Big_4\\src\\20180328183409011_failure_AUT_AA5_P4_ALL_000029_output.xml");
        Document doc = builder.parse(file);
        // Do something with the document here.


        System.out.println(doc);
    }

    public static void saxParse() throws ParserConfigurationException, SAXException, IOException, org.xml.sax.SAXException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(true);
        SAXParser saxParser = null;
        try {
            saxParser = factory.newSAXParser();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
        File file = new File("C:\\codelab\\Big_4\\src\\20180328183409011_failure_AUT_AA5_P4_ALL_000029_output.xml");
        saxParser.parse(file, new DefaultHandler());    // specify handler
    }

    public static void jaxbParse() throws JAXBException, IOException {
        try (FileInputStream adrFile = new FileInputStream("C:\\\\codelab\\\\Big_4\\\\src\\\\20180328183409011_failure_AUT_AA5_P4_ALL_000029_output.xml")) {
            JAXBContext ctx = JAXBContext.newInstance(DataExchangeOutput.class);
            Unmarshaller um = ctx.createUnmarshaller();

            DataExchangeOutput dataExchangeOutput = (DataExchangeOutput) um.unmarshal(adrFile);

        }
    }
}
*/
