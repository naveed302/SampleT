package com.techweaver.inbm.util;

//import com.esignatr.genericlog.GenericLog;
//import com.esignatr.properties.Constant;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class GenerateReadXML {

	public GenerateReadXML() {
		// flag = Constant.DebugFlag;
		// gl = new GenericLog();
	}

	public String generateXML(String rootName, String mainElement,
			String tags[], String tagValue[]) {
		// String path = Constant.LogFilePath;
		// String fileName = Constant.LogFileName;
		// boolean flag = Constant.DebugFlag;
		// String log4jPath = Constant.Log4jPropertyPath;

		// this.gl.setPath(path, fileName, log4jPath);
		// this.gl.writeDebug("stringShow() started", flag);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			// gl.writeDebug("generateXML() started", flag);
			docBuilder = builderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// GenericLog gl = new GenericLog();
			// gl.writeWarning("Error Occured in GenerateReadXML ");
			// gl.writeError(e);
		}
		Document doc = docBuilder.newDocument();
		int size = tags.length;
		int size1 = tagValue.length;
		Element root = doc.createElement(rootName);
		doc.appendChild(root);
		Element subroot = doc.createElement(mainElement);
		root.appendChild(subroot);
		if (size == size1) {
			for (int i = 0; i < size; i++) {
				Element element1 = doc.createElement(tags[i]);
				subroot.appendChild(element1);
				org.w3c.dom.Text text1 = doc.createTextNode(tagValue[i]);
				element1.appendChild(text1);
			}

			TransformerFactory transfac = TransformerFactory.newInstance();
			Transformer trans = null;
			try {
				trans = transfac.newTransformer();
			} catch (TransformerConfigurationException e) {
				// GenericLog gl = new GenericLog();
				// gl.writeWarning("Error Occured in GenerateReadXML ");
				// gl.writeError(e);
			}
			trans.setOutputProperty("omit-xml-declaration", "yes");
			trans.setOutputProperty("indent", "yes");
			StringWriter sw = new StringWriter();
			StreamResult result = new StreamResult(sw);
			DOMSource source = new DOMSource(doc);
			try {
				trans.transform(source, result);
			} catch (TransformerException e) {
				// GenericLog gl = new GenericLog();
				// gl.writeWarning("Error Occured in GenerateReadXML ");
				// gl.writeError(e);
			}
			String xmlString = sw.toString();
			// this.gl.writeDebug((new
			// StringBuilder("generated XML string")).append(xmlString).toString(),
			// flag);
			// this.gl.writeDebug("stringShow() Ended", flag);
			return xmlString;
		} else {
			// GenericLog gl = new GenericLog();
			// gl.writeWarning("sorry: Tag name and Tag value should be equal Number");
			// gl.writeDebug("stringShow() Ended", flag);
			return null;
		}
	}

	public String readXML(String xmlString, String rootName, String tagName) {
		String result = null;
		DocumentBuilder db = null;
		try {
			// gl.writeDebug("readXML() started", flag);
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// GenericLog gl = new GenericLog();
			// gl.writeWarning("Error Occured in GenerateReadXML ");
			// gl.writeError(e);
		}
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(xmlString));
		Document doc = null;
		try {
			doc = db.parse(is);
		} catch (SAXException e) {
			// GenericLog gl = new GenericLog();
			// gl.writeWarning("Error Occured in GenerateReadXML ");
			// gl.writeError(e);
		} catch (IOException e) {
			// GenericLog gl = new GenericLog();
			// gl.writeWarning("Error Occured in GenerateReadXML ");
			// gl.writeError(e);
		}
		NodeList nodes = doc.getElementsByTagName(rootName);
		for (int a = 1; a <= 5; a++) {
			Element element = (Element) nodes.item(0);
			NodeList valueList = element.getElementsByTagName(tagName);
			Element firstValue = (Element) valueList.item(0);
			result = getCharacterDataFromElement(firstValue);
		}
		// gl.writeDebug("readXML() ended", flag);
		return result;
	}

	private static String getCharacterDataFromElement(Element e) {
		Node child = e.getFirstChild();
		CharacterData cd = (CharacterData) child;
		if (child instanceof CharacterData)
			return cd.getData();
		else
			return "";
	}

	public static void main(String args[]) {
		try {
			GenerateReadXML ad = new GenerateReadXML();
			String tagNames[] = { "FirstName", "LastName", "Age", "Contact",
					"City" };
			String tagValues[] = { "naveed", "Khan", "24", "12345", "pune" };
			String root = "Details";
			String mainElement = "Employee";
			String xmlString = ad.generateXML(root, mainElement, tagNames,
					tagValues);

			// System.out.println(xmlString);
			String result = ad.readXML(xmlString, "Details", "Age");
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	boolean flag;
	// GenericLog gl;
}