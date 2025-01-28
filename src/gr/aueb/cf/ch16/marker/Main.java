package gr.aueb.cf.ch16.marker;

public class Main {
    public static void main(String[] args) {
        Attachment attachment = new Attachment("vat", "pdf");
    }

    public static void archive(IArchiveable iArchiveable) {
        if (iArchiveable instanceof Attachment) {
            System.out.println(((Attachment) iArchiveable).getFilename() + "."
                    + ((Attachment) iArchiveable).getExtension() + " is archivable");
        }else {
            System.out.println("Dicument is not archivable");
        }
    }
}
