// Interface

interface Document {

    void open();
}

// Concrete Classes
class WordDocument implements Document {

    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {

    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument implements Document {

    public void open() {
        System.out.println("Opening Excel Document");
    }
}

// Abstract Factory
abstract class DocumentFactory {

    abstract Document createDocument();
}

// Concrete Factories
class WordFactory extends DocumentFactory {

    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {

    public Document createDocument() {
        return new ExcelDocument();
    }
}

// Test class
public class Main {

    public static void main(String[] args) {
        // Create Word document
        DocumentFactory wordFactory = new WordFactory();
        Document doc1 = wordFactory.createDocument();
        doc1.open();

        // Create PDF document
        DocumentFactory pdfFactory = new PdfFactory();
        Document doc2 = pdfFactory.createDocument();
        doc2.open();

        // Create Excel document
        DocumentFactory excelFactory = new ExcelFactory();
        Document doc3 = excelFactory.createDocument();
        doc3.open();
    }
}

// Output :::::
// java Main
// Opening Word Document
// Opening PDF Document
// Opening Excel Document
