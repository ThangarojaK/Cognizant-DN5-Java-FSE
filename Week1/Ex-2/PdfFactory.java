class PdfFactory extends DocumentFactory {

    @Override
    Document createDocument() {
        return new PdfDocument();
    }
}
