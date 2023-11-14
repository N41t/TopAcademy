package Lesson_31;

import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

//������ � xml
public class XML_class {
    public static void main(String[] args) throws IOException {

        //������ xml
//        try {
//
//            File file = new File("parse.xml"); //����� ���� ���������� �������
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
//            Document doc =  (Document) dbBuilder.parse(file);//� ����� ���� ���������� �������
//            doc.getDocumentElement().normalize();
//
//            System.out.println("Root element is " + doc.getDocumentElement().getNodeName());
//
//            //NodeList nodeList = doc.getDocumentElement().getChildNodes(); //���������� ������ ����������� 1 ������
//            NodeList nodeList = doc.getElementsByTagName("staff"); //���������� ������ ����������� 2 ������ (�� ����������� ����)
//
//            for (int i = 0; i < nodeList.getLength(); i++) {
//                Node node = nodeList.item(i); //�������� 1 node -> staff
//
//                System.out.println("Element : " + node.getNodeName());
//                if (node.getNodeType() == Node.ELEMENT_NODE) { //��������� ��� ��������� (���� ��� node, � �� �����)
//                    Element element = (Element) node;
//                    System.out.println();
//                    System.out.println("Staff id : " + element.getAttribute("id"));
//                    System.out.println("Firstname : " + element.getElementsByTagName("firstname").item(0).getTextContent());
//                    System.out.println("Lastname : " + element.getElementsByTagName("lastname").item(0).getTextContent());
//                    System.out.println("Nickname : " + element.getElementsByTagName("nickname").item(0).getTextContent());
//                    System.out.println("Salary : " + element.getElementsByTagName("salary").item(0).getTextContent());
//                }
//            }
//
//        } catch (ParserConfigurationException e) {
//            System.out.println(e.getMessage());
//        } catch (SAXException e) {
//            System.out.println(e.getMessage());
//        }


        //������ xml
        try {

            //File file = new File("parseTo.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            //������� root-������� ������ �������� ��� �����
            Element rootElement = document.createElement("company");
            document.appendChild(rootElement);

            Element staff = document.createElement("staff");
            rootElement.appendChild(staff);
            //���������� �������� staff (��� ��� ��� node - ������� ����� ��������)
            Attr attr = document.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);

            Element firstname = document.createElement("firstname");
            firstname.appendChild(document.createTextNode("Ivan"));
            staff.appendChild(firstname);

            Element lastname = document.createElement("lastname");
            lastname.appendChild(document.createTextNode("Ivanovic"));
            staff.appendChild(lastname);

            Element nickname = document.createElement("nickname");
            nickname.appendChild(document.createTextNode("ivi"));
            staff.appendChild(nickname);

            Element salary = document.createElement("salary");
            salary.appendChild(document.createTextNode("50000"));
            staff.appendChild(salary);


            //��� ��������� �������
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            File file1 = new File("create.xml");//�������� ���� ��� ����������
            StreamResult streamResult = new StreamResult(file1);

            transformer.transform(domSource, streamResult); //��� ���� ���������� � streamResult


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
