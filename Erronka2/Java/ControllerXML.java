package eus.uni.dam;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.SAXException;

public class ControllerXML {

	private String fitxategia = "options.xml";

	public void addToLogXML(String TipoAccesso) throws Exception {

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document doc = documentBuilder.parse(fitxategia);

		Element document = doc.getDocumentElement();

		Node log = document.getLastChild();

		Element acceso = doc.createElement("acceso");
		log.appendChild(acceso);

		acceso.setAttribute("Date", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
		acceso.appendChild(doc.createTextNode(TipoAccesso));

		// clases necesarias finalizar la creación del archivo XML
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(fitxategia));

		transformer.transform(source, result);

	}

	public String irakurriLoga() throws Exception {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document doc = documentBuilder.parse(fitxategia);

		Element document = doc.getDocumentElement();

		NodeList logs = doc.getElementsByTagName("log");

		Element nodo = (Element) logs.item(0);

		NodeList accesos = nodo.getElementsByTagName("acceso");

		String s = "";

		for (int i = 0; i < accesos.getLength(); i++) {

			s = s + (i + 1) + ". " + "Konexio Data: " + accesos.item(i).getAttributes().item(0).getTextContent()
					+ "\n Informazioa: " + accesos.item(i).getTextContent()
					+ "\n------------------------------------------------\n";
		}

		return s;

	}

	public int getProduktuKantitateaXml() throws Exception {
		int kantitatea;

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document doc = documentBuilder.parse(fitxategia);

		Element document = doc.getDocumentElement();

		NodeList options = doc.getElementsByTagName("options");

		Element nodo = (Element) options.item(0);

		kantitatea = Integer.parseInt(nodo.getElementsByTagName("ProduktuKopurua").item(0).getTextContent());

		return kantitatea;
	}

	public void setProduktuKantitatea(int kantitatea) throws Exception {

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document doc = documentBuilder.parse("options.xml");
		Element document = doc.getDocumentElement();

		NodeList options = doc.getElementsByTagName("options");
		Element nodo = (Element) options.item(0);

		Element produktukopurua = (Element) nodo.getElementsByTagName("ProduktuKopurua").item(0);
		produktukopurua.setTextContent(kantitatea + "");

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(fitxategia));

		transformer.transform(source, result);

	}

	public void createXML() {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();

			ProcessingInstruction pi = doc.createProcessingInstruction("xml-stylesheet",
					"type=\"text/xsl\" href=\"options.xslt\"");
			// definimos el elemento raíz del documento

			Element document = doc.createElement("document");
			doc.appendChild(document);
			doc.insertBefore(pi, document);

			Element options = doc.createElement("options");
			document.appendChild(options);

			Element ProduktuKopurua = doc.createElement("ProduktuKopurua");
			options.appendChild(ProduktuKopurua);

			ProduktuKopurua.appendChild(doc.createTextNode(0 + ""));

			Element log = doc.createElement("log");
			document.appendChild(log);

			Element acceso = doc.createElement("acceso");
			log.appendChild(acceso);

			acceso.setAttribute("Date", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
			acceso.appendChild(doc.createTextNode("Fitxategia Sortu"));

			// clases necesarias finalizar la creación del archivo XML
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(fitxategia));

			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
