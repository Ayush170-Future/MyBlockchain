package SimpleBlockchain;

import java.util.Arrays;
import java.util.Objects;

public class Block {

	private int initialHash;
	private String[] transactions;
	private int BlockHash;
	public Block next;
	
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
