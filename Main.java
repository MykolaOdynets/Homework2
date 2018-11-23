package Site1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

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
		Map<String, String> m1 = new HashMap<>();
		m1.put(home.title, home.toString());
		m1.put(login.title, login.toString());
		m1.put(about1.title, about1.toString());
		m1.put(about2.title, about2.toString());
		m1.put(forum1.title, forum1.toString());
		m1.put(forum2.title, forum2.toString());
		
		for (Entry<String, String> entryOfMap : m1.entrySet()) {
			String key = entryOfMap.getKey();
			System.out.println("key: " + key);
			String value = entryOfMap.getValue();
			System.out.println("value: " + value);
		}

		System.out.println(" Map Elements");
		System.out.print("\t" + m1);
	}
}
