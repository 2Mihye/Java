package chap37_TodoList;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// �ּ��� ArrayList

public class TodoListSwitch {
	//private ArrayList<String> tasks;
	private Map<Integer, String> tasks;
	private int nextId;
	
	public TodoListSwitch() {
		// tasks = new ArrayList<>();
		tasks = new HashMap<>();
		nextId = 1;
	}
	
	public void addTask(String task) {
		// tasks.add(task);
		tasks.put(nextId, task);
		nextId++;
	}
	/*
	public void removetask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}
	
	public void editTask(int index, String task) {
		tasks.set(index, task);
	}
	*/
	public void removetask(int Id) {
		if(tasks.containsKey(Id)) {
			tasks.remove(Id);
		} else {
			System.out.println("��ȿ���� ����.");
		}
	}
	
	public void displayTasks() {
		System.out.println("My TodoList");
		/*for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}*/
		for(Map.Entry<Integer, String> entry : tasks.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		TodoListSwitch todoList = new TodoListSwitch();

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�� �� �߰�: add, �� �� ����: remove, �� �� ����: list, ����: Exit, ����: Edit�� �Է��ϼ���");
			
			String choice = sc.nextLine();
			
			if(/*choice.equals("add") || */choice.equalsIgnoreCase("Add")/*���ڰ� �빮������ �ҹ������� ������� �ʰ� ���ڴ�*/) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todoList.addTask(task);
					//equalIgnoreCase
				
			} else if (choice.equals("remove")||choice.equals("REMOVE")||choice.equals("Remove")) { /*�Ǵ� choice.equals("REMOVE")*/
				System.out.println("������ ���� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removetask(index);
				} catch(Exception e) {
					System.out.println("�������� ���� �Է��Դϴ�.");
				}
				
			} else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
				
			}else if (choice.equalsIgnoreCase("exit")) {
				break;
				
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}

}
