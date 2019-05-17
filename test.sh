javac main.java.strings.Convertor.NumberConvertor.java
java main.java.strings.Convertor.NumberConvertor --base 8 123 > actual
diff actual ExpectedOutputOfBase8for123number

java main.java.strings.Convertor.NumberConvertor --base 8 1 > actual
diff actual ExpectedOutputOfBase8for1number

java main.java.strings.Convertor.NumberConvertor --base 2 34 > actual
diff actual ExpectedOutputOfBase2for34number

java main.java.strings.Convertor.NumberConvertor --base 7 56 > actual
diff actual ExpectedOutputOfBase7for56number