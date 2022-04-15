class Encryptor {
    private char[] mSourceText;
    private int mKey;
    private EncryptionAlgorithm mAlgorithm;
    
    public Encryptor(char[] sourceText, int key, EncryptionAlgorithm algorithm) {
        mSourceText = sourceText;
        mKey = key;
        mAlgorithm = algorithm;
    }
    
    public void setSourceText(char[] sourceText) {
        mSourceText = sourceText;
    }
    
    public char[] getSourceText() {
        return mSourceText;
    }
    
    public void setKey(int key) {
        mKey = key;
    }
    
    public void setEncryptionAlgorithm(EncryptionAlgorithm algorithm) {
        mAlgorithm = algorithm;
    }
 
    public char[] encrypt() {
        if (mAlgorithm == EncryptionAlgorithm.XOR) {
            return xor();
        }
        
        return mSourceText;
    }
    
    private char[] xor() {
        char[] encryptedText = new char[mSourceText.length];
        for (int i = 0; i < mSourceText.length; i++) {
            encryptedText[i] = (char) (mSourceText[i] ^ mKey);
        }
        
        return encryptedText;
    }
} 
