class ExcelFactory extends DocumentFactory {

    @Override
    Document createDocument() {
        return new ExcelDocument();
    }
}
