package test.java;

import main.java.Node;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NodeTest
{

	Node testNode;

	@BeforeEach
	void setUp()
	{
		testNode = new Node(0);
		testNode.setLeft(new Node(1));
		testNode.setRight(new Node(2));
	}

	@Test
	void getValue()
	{
		int testValue = testNode.getValue();
		assertEquals(0, testValue);
	}

	@Test
	void setValue()
	{
		int testValue = 5;
		testNode.setValue(testValue);

		int nodeValue = testNode.getValue();
		assertEquals(testValue, nodeValue);
	}

	@Test
	void getLeft()
	{
		int testValue = 1;

		Node leftNode = testNode.getLeft();
		int nodeValue = leftNode.getValue();
		assertEquals(testValue, nodeValue);
	}

	@Test
	void setLeft()
	{
		int testValue = 5;
		Node newTestNode = new Node(testValue);
		testNode.setLeft(newTestNode);

		Node leftTestNode = testNode.getLeft();
		int nodeValue = leftTestNode.getValue();
		assertEquals(testValue, nodeValue);
	}

	@Test
	void getRight()
	{
		int testValue = 2;

		Node rightNode = testNode.getRight();
		int nodeValue = rightNode.getValue();
		assertEquals(testValue, nodeValue);
	}

	@Test
	void setRight()
	{
		int testValue = 5;
		Node newTestNode = new Node(testValue);
		testNode.setRight(newTestNode);

		Node rightTestNode = testNode.getRight();
		int nodeValue = rightTestNode.getValue();
		assertEquals(testValue, nodeValue);
	}
}