package chap37_TodoList;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 주석은 ArrayList

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
			System.out.println("잘못된 인덱스입니다.");
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
			System.out.println("유효하지 않음.");
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
			System.out.println("할 일 추가: add, 할 일 삭제: remove, 할 일 보기: list, 종료: Exit, 수정: Edit을 입력하세요");
			
			String choice = sc.nextLine();
			
			if(/*choice.equals("add") || */choice.equalsIgnoreCase("Add")/*문자가 대문자인지 소문자인지 상관하지 않고 보겠다*/) {
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todoList.addTask(task);
					//equalIgnoreCase
				
			} else if (choice.equals("remove")||choice.equals("REMOVE")||choice.equals("Remove")) { /*또는 choice.equals("REMOVE")*/
				System.out.println("삭제할 일의 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removetask(index);
				} catch(Exception e) {
					System.out.println("유요하지 않은 입력입니다.");
				}
				
			} else if (choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
				
			}else if (choice.equalsIgnoreCase("exit")) {
				break;
				
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		sc.close();
	}

}
