class WordFactory extends DocumentFactory {

    @Override
    Document createDocument() {
        return new WordDocument();
    }
}
