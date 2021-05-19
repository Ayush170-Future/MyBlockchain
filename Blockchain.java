package SimpleBlockchain;

public class Blockchain {

	public static void main(String[] args) {
		
		String[] genesisTransactions = {"Elon made Ayush a Billionaire by giving him 1000 bitcoin", "Ayush gave away all the bitcoins to poor people because he is a nobal guy"};
		Block genesisBlock = new Block(0, genesisTransactions);
		
		String[] block2Transactions = {"Bill gave away 10000 bitcoin to the people in Africa", "Gates foundation gets 10000 bitcoin of donation from some unknown source, Africa suspected"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		genesisBlock.next = block2;
		
		System.out.println("Hash of Genesis Block");
		System.out.println(genesisBlock.getBlockHash());
		System.out.println("Hash of Second Block");
		System.out.println(block2.getBlockHash());
	}
}
