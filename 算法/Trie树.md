## 概述
Trie树是一颗多叉树，其本质就是利用字符串之间的公共前缀，将重复的前缀合并在一起

## 如何实现一颗Trie树
主要有两个操作

- 将字符串集合构造成Trie树

- 在Trie树中查询一个字符串


### 二叉树数据结构
```java
  class BinaryTreeNode {
    char data;
    BinaryTreeNode left;
    BinaryTreeNode right;
  }
```

### Trie树数据结构
```java
  class TrieNode {
    char data;
    TrieNode children[26];
  }
```

==> 深入

```java
  public class Trie {
    private TrieNode root = new TrieNode('/');
    
    // 往Trie树中插入一个字符串
    public void insert(char[] text) {
      TrieNode p = root;
      for (int i = 0; i < text.length; i++) {
        int index = text[i] - 'a';
        if (p.children[index] == null) {
          TrieNode newNode = new TrieNode(text[i]);
          p.children[index] = newNode;
        }
        p = p.children[index];
      }
      p.isEndingChar = true;
    }
    
    // 在Trie树中查找一个字符串
    public boolean find(char[] pattern) {
      TrieNode p = root;
      for (int i = 0; i < pattern.length; i++) {
        int index = pattern[i] - 'a';
        if (p.children[index] == null) {
          return false; // 不存在对应的字符串
        }
        p = p.children[index];
      }
      
      return p.isEndingChar;
    }
    
    public class TrieNode {
      public char data;
      public TireNode[] children = new TrieNode[26];
      public boolean isEndingChar = false;
      
      public TrieNode(char data) {
        this.data = data;
      }
    }
  }
```

## 时间复杂度
在构建好的Trie中，查找其中的字符串的时间复杂度是O(n)，n为字符串长度

## 耗内存
优化

- 将每个节点中的数组换成其他数据结构（有序数组、跳表、散列表、红黑树等）

- 缩点优化：就是对只有一个子节点的节点，而且此节点不是一个串的结束节点，可以将此节点与子节点合并


