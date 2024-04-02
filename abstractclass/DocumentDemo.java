package abstractclass;

abstract public class DocumentDemo {
    private String documentName;
    private String size;
    public DocumentDemo(String documentName, String size) {
        this.documentName = documentName;
        this.size = size;
    }

    public String getDocumentName() {
        return documentName;
    }

    public String getSize() {
        return size;
    }
    public abstract void getDocumentDetails();
}
class PDFDocument extends DocumentDemo{
    public PDFDocument(String documentname, String size) {
        super(documentname, size);
    }

    @Override
    public void getDocumentDetails() {
        System.out.println("Document name="+getDocumentName()+",Size="+getSize());
    }
}
class TextDocument extends DocumentDemo{
    public TextDocument(String documentname, String size) {
        super(documentname, size);
    }
    public void getDocumentDetails() {
        System.out.println("Document name="+getDocumentName()+",Size="+getSize());
    }
}
class ImageDocument extends DocumentDemo{
    public ImageDocument(String documentname, String size) {
        super(documentname, size);
    }
    public void getDocumentDetails() {
        System.out.println("Document name="+getDocumentName()+",Size="+getSize());
    }
}
class DocumentDriver{
    public static void main(String[] args) {
        DocumentDemo document1=new PDFDocument("basic.pdf","1mb");
        DocumentDemo document2=new TextDocument("demo.txt","75kb");
        DocumentDemo document3=new ImageDocument("profile.img","50mb");
        document1.getDocumentDetails();
        document2.getDocumentDetails();
        document3.getDocumentDetails();
    }
}
