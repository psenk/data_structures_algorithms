package test.java;

import java.util.ArrayList;
import java.util.List;
import main.java.Node;
import main.java.Tree;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest
{
	Tree testTree;

	@BeforeEach
	void setUp()
	{
		Node root = new Node(0);
		testTree = new Tree(root);
	}

	@Test
	void getRoot()
	{
		int testValue = 0;

		Node testRoot = testTree.getRoot();
		assertNotNull(testRoot);
		int rootValue = testRoot.getValue();
		assertEquals(testValue, rootValue);
	}

	@Test
	void setRoot()
	{
		int newTestValue = 5;
		Node newTestRoot = new Node(newTestValue);
		testTree.setRoot(newTestRoot);

		Node testRoot = testTree.getRoot();
		assertNotNull(testRoot);
		int testValue = testRoot.getValue();
		assertEquals(newTestValue, testValue);
	}

	@Test
	void createTree()
	{
		int rootTestValue = 1;
		int testValue = 5;
		List<Integer> testTreeInput = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

		Tree newTree = Tree.createTree(testTreeInput);
		assertNotNull(newTree);
		Node testRoot = newTree.getRoot();
		assertNotNull(testRoot);
		int rootValue = testRoot.getValue();
		assertEquals(rootTestValue, rootValue);

		Node leftChild = testRoot.getLeft();
		Node testNode = leftChild.getRight();
		assertNotNull(testNode);
		int testNodeValue = testNode.getValue();
		assertEquals(testValue, testNodeValue);
	}
}