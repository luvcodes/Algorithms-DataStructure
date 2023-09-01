import java.util.PriorityQueue;
import java.util.HashMap;

class HuffmanNode implements Comparable<HuffmanNode> {
    char character;
    int frequency;
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

public class HuffmanTree {

    public static HuffmanNode buildHuffmanTree(HashMap<Character, Integer> frequencies) {
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();
        
        // Create initial nodes with characters and frequencies
        for (char c : frequencies.keySet()) {
            priorityQueue.offer(new HuffmanNode(c, frequencies.get(c)));
        }
        
        // Build Huffman tree
        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            
            HuffmanNode mergedNode = new HuffmanNode('\0', left.frequency + right.frequency);
            mergedNode.left = left;
            mergedNode.right = right;
            
            priorityQueue.offer(mergedNode);
        }
        
        return priorityQueue.poll(); // Return the root of the Huffman tree
    }

    public static void printHuffmanCodes(HuffmanNode node, String code) {
        if (node == null) {
            return;
        }

        if (node.character != '\0') {
            System.out.println(node.character + ": " + code);
        }

        printHuffmanCodes(node.left, code + "0");
        printHuffmanCodes(node.right, code + "1");
    }

    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Character, Integer> frequencies = new HashMap<>();
        
        for (char c : input.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }

        HuffmanNode root = buildHuffmanTree(frequencies);
        printHuffmanCodes(root, "");
    }
}
