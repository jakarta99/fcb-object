<<<<<<< HEAD
# Chapter 0 Gary Lee
xxx
yyy
Haha , zzzz

# Chapter 1 Yuwei-lee

##Jilldolala is FCBMatt

# Chapter 2 CopyKobe0103


# Chapter 3 iJoshua29


# Chapter 4 LukeKaiQQ


# Chapter 5 DragonIris7
##test 安安 您好~~


# Chapter 6 Singjen626


# Chapter 7 Footwalk
## 大家好
好喔
### HELLO
HOHO

# Chapter 8 HsiehCJ

```diff
+ My name is Cheng-Jung
```

# Chapter 9 Jilldolala25
### 我是張涵茹  dolala 多啦A夢愛好者

# Chapter 10 H25949
=======
Jilldolala is FCBMatt

# Chapter 2 CopyKobe0103


# Chapter 3 iJoshua29


# Chapter 4 LukeKaiQQ


# Chapter 5 DragonIris7
##test 安安 您好~~
###test 標題


# Chapter 6 Singjen626
##你好，我是新人

# Chapter 7 Footwalk
## 大家好

# Chapter 8 HsiehCJ

```diff
+ My name is Cheng-Jung
```


# Chapter 9 Jilldolala25
### 我是張涵茹  dolala 多啦A夢愛好者

# Chapter 10 H25949
## hi hi~!!

=======
# Course 3 深入理解 Object

## Primitives

* boolean
* byte
* char
* short
* int
* long
* double
* float

這些數值預設都是 0.

## java.lang.Object

有幾個 methods 需要特別注意

* toString();
* hashCode();
* equals(o);

當我們期望比較兩個物件是相同時, 我們會同時 override hashCode() 與 equals(o) methods
![image](https://user-images.githubusercontent.com/1997268/150979975-364b8269-fd59-4e3f-abb2-e1e100ad3aba.png)


```java
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(name, other.name);
	}
```
那麼, 明明 equals 就可以比較出來 java object 是否相同, 為何還要定義 hashCode() method 呢? 
主要是因為 java 為了效能, 如果是 HashSet 這樣的物件比較是否有重複的物件時, 
會先針對 hashCode 來比較, 再呼叫 equals 是否相同.
所以, 為了避免這類型的問題, 我們會同時 override hashCode 與 equals.


## java.lang.String

String 是一個很特別的物件, 

```
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");
String str4 = new String("Hello");

System.out.println(str1 == str2);
System.out.println(str3 == str4);

```

str1 和 str2 的處理方式比較像是 primitive 的做法, 而 str3 和 str4 則是 new 出一個 String 物件.
第一個比較結果是 true, 因為 str1 和 str2 都是指到同一個值.
而 str3 和 str4 因為是 new 出來的一個參考空間, 所以 reference 記憶體空間一定不同. 所以結果是 false.

String 是非常常用的物件, 所以我們常會需要轉型為其他型別

``` java
int number = 10;
String str1 = ""+number; // 轉型為 String
String str2 = String.valueOf(number); // 轉為 String, (比較好)
```

相關 String methods 內容

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

我建議要學習的 methods 
* contact
* indexOf
* length
* replace
* split
* substring
* toUpperCase
* toLowerCase
* valueOf

## 學習 git

練習 git

## HomeWork
寫一個 8 碼補零的 method.

```java
int num = 12;
String result = ??
```
>>>>>>> branch 'main' of https://github.com/jakarta99/fcb-object.git
