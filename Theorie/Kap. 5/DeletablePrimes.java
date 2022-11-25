import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(
   mv = {1, 7, 1},
   k = 2,
   d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¨\u0006\f"},
   d2 = {"isPrime", "", "n", "", "main", "", "test", "", "number", "", "excluded", "", "DeletablePrimes"}
)
public final class MainKt {
   private static final boolean isPrime(long n) {
      if (n < (long)2) {
         return false;
      } else if (n != 2L && n != 3L) {
         if (n % (long)2 != 0L && n % (long)3 != 0L) {
            long sqrtN = (long)Math.sqrt((double)n) + 1L;

            for(long i = 6L; i <= sqrtN; i += (long)6) {
               if (n % (i - 1L) == 0L || n % (i + 1L) == 0L) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private static final int test(String number, Set excluded) {
      int $i$f$filterIndexed = false;
      CharSequence $this$filterIndexedTo$iv$iv = (CharSequence)number;
      Appendable destination$iv$iv = (Appendable)(new StringBuilder());
      int $i$f$filterIndexedTo = false;
      CharSequence $this$forEachIndexed$iv$iv$iv = $this$filterIndexedTo$iv$iv;
      int $i$f$forEachIndexed = false;
      int index$iv$iv$iv = 0;

      for(int var10 = 0; var10 < $this$forEachIndexed$iv$iv$iv.length(); ++var10) {
         char item$iv$iv$iv = $this$forEachIndexed$iv$iv$iv.charAt(var10);
         int index$iv$iv = index$iv$iv$iv++;
         int var14 = false;
         int var17 = false;
         if (!excluded.contains(index$iv$iv)) {
            destination$iv$iv.append(item$iv$iv$iv);
         }
      }

      String var21 = ((StringBuilder)destination$iv$iv).toString();
      Intrinsics.checkNotNullExpressionValue(var21, "filterIndexedTo(StringBu…(), predicate).toString()");
      String var2 = var21;
      if (!isPrime(Long.parseLong(var2))) {
         return 0;
      } else if (excluded.size() == number.length()) {
         return 0;
      } else if (excluded.size() == number.length() - 1) {
         return 1;
      } else {
         int sum = 0;
         int i = 0;

         for(int var20 = number.length(); i < var20; ++i) {
            if (!excluded.contains(i)) {
               excluded.add(i);
               sum += test(number, excluded);
               excluded.remove(i);
            }
         }

         return sum;
      }
   }

   public static final void main() {
      String number = "103";
      HashSet excluded = new HashSet();
      int result = test(number, (Set)excluded);
      System.out.println(result);
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }
}
