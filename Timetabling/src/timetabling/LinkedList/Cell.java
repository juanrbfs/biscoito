package timetabling.LinkedList;

//estrutura de registro de uma lista encadeada
public class Cell {
	
	private int line;
	private int column;
	private int value;
	private Cell nextLineNode;
	private Cell nextColumnNode;
	
	Cell(){}
	
	Cell(int line,int column,int value){
		this.line = line;
		this.column = column;
		this.value = value;
	}
	
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public Cell getNextLineNode() {
		return nextLineNode;
	}

	public void setNextLineNode(Cell nextLineNode) {
		this.nextLineNode = nextLineNode;
	}

	public Cell getNextColumnNode() {
		return nextColumnNode;
	}

	public void setNextColumnNode(Cell nextColumnNode) {
		this.nextColumnNode = nextColumnNode;
	}
	
}
