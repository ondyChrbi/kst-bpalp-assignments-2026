# BPALP – Práce na vlastním zařízení

Tento návod popisuje, jak si nainstalovat potřebný software pro cvičení v předmětu **BPALP – Praktikum z programování a algoritmizace**. Pro výuku budeme používat následující nástroje:

- **Oracle JDK** – Java Development Kit, potřebný pro kompilaci a spouštění java programů.
- **NetBeans** – doporučené vývojové prostředí (IDE) pro psaní a debugování kódu.
- Alternativně lze použít **IntelliJ IDEA**.
- Ultimate edice je zdarma pro studenty po dobu studia.
- [K aktivaci](http://jetbrains.com/academy/student-pack/) stačí ISIC nebo přístup k univerzitnímu e-mailu.
- **Git** – nástroj pro verzování kódu a odevzdávání úkolů. Bude vyžadován v pozdější části kurzu.

---

## Windows / Manuální instalace

Software nainstalujte manuálně stažením instalátorů z oficiálních stránek:

### 1. Oracle JDK

1. Stáhněte instalátor verze JDK 25 z [oficiálních stránek Oracle](https://www.oracle.com/java/technologies/downloads/#java25).

2. Po instalaci ověřte, že je Java správně nainstalovaná – otevřete příkazovou řádku (`cmd` nebo `powershell`) a zadejte:
```
java -version
```

3. Výstup by měl být obdobný:

```
java version "25.X.X" XXXX-XX-XX
Java(TM) SE Runtime Environment (build 25.X.X+X)
Java HotSpot(TM) 64-Bit Server VM (build 25.X.X+X, mixed mode, sharing)
```

### 2. NetBeans

1. Stáhněte instalátor nejnovější verze NetBeans z [oficiálních stránek Apache NetBeans](https://netbeans.apache.org/download/index.html)
2. Po instalaci ověřte, že je NetBreans nainstalovaný dostupností aplikace **Apache NetBetbeans**.
- Ve vyhledávači nebo v nabídce Start.

### 3. Git

1. Stáhněte instalátor Gitu pro Windows z [oficiálních stránek](https://git-scm.com/download/win).
2. Po instalaci ověřte, že je Git nainstalovaný dostupností aplikace **Git Bash**.
- Ve vyhledávači nebo v nabídce Start.

---

## Mac OS

K instalaci můžete využít správce balíčků **Homebrew**. Příkazy níže zadávejte v aplikaci **Terminál** nebo **iTerm2**.

### 1. Instalace Homebrew

1. Postupujte podle návodu na [oficiálních stránkách Homebrew](https://brew.sh).

2. Po instalaci ověřte, že Homebrew funguje:
```bash
brew --version
```

3. Výstup by měl být obdobný:
```
Homebrew 7.X.X
```

### 2. Oracle JDK

1. Nainstalujte Oracle JDK 25 pomocí Homebrew cask:
```bash
brew install --cask oracle-jdk@25
```

2. Po instalaci ověřte, že je Java správně nainstalovaná pomocí příkazu:
```bash
java -version
```

3. Výstup by měl být obdobný:
```
java version "25.X.X" XXXX-XX-XX
Java(TM) SE Runtime Environment (build 25.X.X+X)
Java HotSpot(TM) 64-Bit Server VM (build 25.X.X+X, mixed mode, sharing)
```

### 3. NetBeans

1. Nainstalujte nejnovější verzi NetBeans pomocí Homebrew cask:
```bash
brew install --cask netbeans
```

### 4. Git

⚠️ _Git bývá na Mac OS často předinstalovaný (součást Xcode Command Line Tools)._

1. Nainstalujte Git pomocí Homebrew:
```bash
brew install git
```

2. Po instalaci ověřte verzi:
```bash
git --version
```

3. Výstup by měl být obdobný:
```
git version 2.XX.X
```

---

## Linux

V Linuxu si můžete potřebný software (Oracle JDK, NetBeans, Git) nainstalovat buď **manuálně** podle instrukcí a odkazů uvedených v sekci [Windows / Manuální instalace](#windows--manuální-instalace) nebo pomocí **svého oblíbeného správce balíčků**.

---