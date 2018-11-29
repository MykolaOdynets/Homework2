package Site1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Page {
	//Кожна веб сторінка (page) має 3 характеристики - title і url, htmlContent.
	int num;
	String title;
	String url;
	String htmlCotnent;
	 void htmlBuilder(String[] args) {	
	 	System.out.println("Я виводжу метод htmlBuilder для сторінки " + " "+ title +" "+ url);
	 }
	 void refresh() {	 }
	 
	 void load() {	 }
	 
	 void get_html_Chrome() { }
	 void get_html_Firefox() { }
	 
	 

	public static void main(String[] args) {

		Page home = new Page();
		home.num = 1;
		home.title = "hometitle";
		home.url = "homeurl";
		home.htmlCotnent = "Chrome,Firefox";

		Page login = new Page();
		login.num = 2;
		login.title = "logintitle";
		login.url = "loginurl";
import java.util.ArrayList;

public class Page {
	//Кожна веб сторінка (page) має 3 характеристики - title і url, htmlContent.
	int num;
	String title;
	String url;
	String htmlCotnent;
	 void htmlBuilder(String[] args) {	
	 	System.out.println("Я виводжу метод htmlBuilder для сторінки " + " "+ title +" "+ url);
	 }
	 void refresh() {	 }
	 
	 void load() {	 }
	 
	 void get_html_Chrome() { }
	 void get_html_Firefox() { }
	 
	 

	public static void main(String[] args) {

		Page home = new Page();
		home.num = 1;
		home.title = "hometitle";
		home.url = "homeurl";
		home.htmlCotnent = "Chrome,Firefox";

		Page login = new Page();
		login.num = 2;
		login.title = "logintitle";
		login.url = "loginurl";
		login.htmlCotnent = "Chrome,Firefox";

		Page about1 = new Page();
		about1.num = 3;
		about1.title = "about1title";
		about1.url = "about1url";
		about1.htmlCotnent = "Firefox";

		Page about2 = new Page();
		about2.num = 4;
		about2.title = about1.title;
		about2.url = "about2url";
		about2.htmlCotnent = "Firefox";

		Page forum1 = new Page();
		forum1.num = 5;
		forum1.title = "forum1title";
		forum1.url = "forum1url";
		forum1.htmlCotnent = "Chrome";

		Page forum2 = new Page();
		forum2.num = 6;
		forum2.title = forum1.title;
		forum2.url = "forum2url";
		forum2.htmlCotnent = "Chrome";

		// Створити колекцію всіх можливих сторінок сайту
		List<Page> Pages = new ArrayList<Page>();
		Collections.addAll(Pages, home, login, about1, about2, forum1, forum2);
		System.out.println("1.Колекція всіх пейджів");
		for (int i = 0; i < Pages.size(); i++) {
			Page qq = (Pages.get(i));
			// 1. Вивести на екран колекцію всіх можливих пейджів сайту.
			System.out.println(qq.num + " " + qq.title + " " + qq.htmlCotnent + " " + qq.url);
		}
		System.out.println();

		// 2.1 Вивести на екран колекцію тільки тих пейджів, які відкриваються в ФФ
		System.out.println("2.1.Тільки ті, що відкриваються в ФФ");

		for (int i = 0; i < Pages.size(); i++) {
			if (Pages.get(i).htmlCotnent.contains("Firefox")) {
				Page qq = (Pages.get(i));
				System.out.println(qq.num + " " + qq.title + " " + qq.htmlCotnent + " " + qq.url);
			}
		}
		System.out.println();

		// 2.2 Вивести на екран колекцію тільки тих пейджів, які відкриваються в Хромі
		System.out.println("2.2.Відкриваються тільки в Хромі");
		for (int i = 0; i < Pages.size(); i++) {
			if (Pages.get(i).htmlCotnent.equals("Chrome")) {
				Page qq = (Pages.get(i));
				System.out.println(qq.num + " " + qq.title + " " + qq.htmlCotnent + " " + qq.url);
			}
		}
		System.out.println();

		// 3. Виконання htlmBuilder кожної сторінки
		System.out.println("3.Виконання htlmBuilder кожної сторінки");
		for (int i = 0; i < Pages.size(); i++) {
			Pages.get(i).htmlBuilder(args);
		}
		System.out.println();

		// 4. Вивести на екран множину унікальних title всіх пейджів сайту
		Set<String> setWithoutDuplicates = new HashSet<>();
		Collections.addAll(setWithoutDuplicates, home.title, login.title, about1.title, about2.title, forum1.title,
				forum2.title);
		System.out.println("4.Унікальні title всіх пейджів сайту");
		System.out.println(setWithoutDuplicates);

		// 5. Вивести на екран мапу, яка буде містити ключ - title сторінки, value -
		// список сторінок з таким title, пройтись по мапі та вивести на екран
		// htmlContent кожної з сторінок доданих у мапу
		Map<String, Page> m1 = new HashMap<>();
		m1.put(home.title, home);
		m1.put(login.title, login);
		m1.put(about1.title, about1);
		m1.put(about2.title, about2);
		m1.put(forum1.title, forum1);
		m1.put(forum2.title, forum2);
		
		for (int i = 0; i < m1.size(); i++) {
			System.out.println(m1);
		}
		
		

		System.out.println(" Map Elements");
		System.out.print("\t" + m1);
	}
}
		login.htmlCotnent = "Chrome,Firefox";

		Page about1 = new Page();
		about1.num = 3;
		about1.title = "about1title";
		about1.url = "about1url";
		about1.htmlCotnent = "Firefox";

		Page about2 = new Page();
		about2.num = 4;
		about2.title = about1.title;
		about2.url = "about2url";
		about2.htmlCotnent = "Firefox";

		Page forum1 = new Page();
		forum1.num = 5;
		forum1.title = "forum1title";
		forum1.url = "forum1url";
		forum1.htmlCotnent = "Chrome";

		Page forum2 = new Page();
		forum2.num = 6;
		forum2.title = forum1.title;
		forum2.url = "forum2url";
		forum2.htmlCotnent = "Chrome";

		// Створити колекцію всіх можливих сторінок сайту
		List<Page> Pages = new ArrayList<Page>();
		Collections.addAll(Pages, home, login, about1, about2, forum1, forum2);
		System.out.println("1.Колекція всіх пейджів");
		for (int i = 0; i < Pages.size(); i++) {
			Page qq = (Pages.get(i));
			// 1. Вивести на екран колекцію всіх можливих пейджів сайту.
			System.out.println(qq.num + " " + qq.title + " " + qq.htmlCotnent + " " + qq.url);
		}
		System.out.println();

		// 2.1 Вивести на екран колекцію тільки тих пейджів, які відкриваються в ФФ
		System.out.println("2.1.Тільки ті, що відкриваються в ФФ");

		for (int i = 0; i < Pages.size(); i++) {
			if (Pages.get(i).htmlCotnent.contains("Firefox")) {
				Page qq = (Pages.get(i));
				System.out.println(qq.num + " " + qq.title + " " + qq.htmlCotnent + " " + qq.url);
			}
		}
		System.out.println();

		// 2.2 Вивести на екран колекцію тільки тих пейджів, які відкриваються в Хромі
		System.out.println("2.2.Відкриваються тільки в Хромі");
		for (int i = 0; i < Pages.size(); i++) {
			if (Pages.get(i).htmlCotnent.equals("Chrome")) {
				Page qq = (Pages.get(i));
				System.out.println(qq.num + " " + qq.title + " " + qq.htmlCotnent + " " + qq.url);
			}
		}
		System.out.println();

		// 3. Виконання htlmBuilder кожної сторінки
		System.out.println("3.Виконання htlmBuilder кожної сторінки");
		for (int i = 0; i < Pages.size(); i++) {
			Pages.get(i).htmlBuilder(args);
		}
		System.out.println();

		// 4. Вивести на екран множину унікальних title всіх пейджів сайту
		Set<String> setWithoutDuplicates = new HashSet<>();
		Collections.addAll(setWithoutDuplicates, home.title, login.title, about1.title, about2.title, forum1.title,
				forum2.title);
		System.out.println("4.Унікальні title всіх пейджів сайту");
		System.out.println(setWithoutDuplicates);

		// 5. Вивести на екран мапу, яка буде містити ключ - title сторінки, value -
		// список сторінок з таким title, пройтись по мапі та вивести на екран
		// htmlContent кожної з сторінок доданих у мапу
		Map<String, Page> m1 = new HashMap<>();
		m1.put(home.title, home);
		m1.put(login.title, login);
		m1.put(about1.title, about1);
		m1.put(about2.title, about2);
		m1.put(forum1.title, forum1);
		m1.put(forum2.title, forum2);
		
		for (int i = 0; i < m1.size(); i++) {
			System.out.println(m1);
		}
		
		

		System.out.println(" Map Elements");
		System.out.print("\t" + m1);
	}
}
