package main.java;

import java.util.ArrayList;
import java.util.List;

public class Tree
{
	private Node root;

	public Tree(Node root)
	{
		this.root = root;
	}

	public Node getRoot()
	{
		return root;
	}

	public void setRoot(Node root)
	{
		this.root = root;
	}

	public static Tree createTree(List<Integer> list)
	{
		if (list.isEmpty()) return new Tree(new Node(0));

		Node root = new Node(list.getFirst());
		Tree tree = new Tree(root);

		List<Node> treeList = new ArrayList<>();
		treeList.add(root);

		for (int i = 1; i < list.size(); i++)
		{
			Node newNode = new Node(list.get(i));
			Node parentNode = treeList.get((i - 1) / 2);

			if (i % 2 == 1) parentNode.setLeft(newNode);
			else parentNode.setRight(newNode);

			treeList.add(newNode);
		}

		return tree;
	}
}
