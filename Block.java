package SimpleBlockchain;

import java.util.Arrays;

public class Block {

	private int initialHash;       // previous hash
	private String[] transactions; // random transaction
	private int BlockHash;         // this.block address or hash
	public Block next;             // Class variable or objects reference used for chaining
	
	Block(int initialHash, String[] transactions) {
		this.initialHash = initialHash;
		this.transactions = transactions;
		
		Object[] contents = {Arrays.hashCode(transactions), initialHash};
		this.BlockHash = Arrays.hashCode(contents);
	}

	public int getInitialHash() {
		return initialHash;
	}

	public String[] getTransactions() {
		return transactions;
	}

	public int getBlockHash() {
		return BlockHash;
	}
	
}
