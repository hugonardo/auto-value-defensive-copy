package test;

import com.google.auto.value.AutoValue;
import com.kevinmost.auto.value.defensive_copy.adapter.DefensiveCopy;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@AutoValue
public abstract class DefensiveArray {
  @NotNull public abstract String userName();
  @NotNull public abstract List<String> orderIDs();
  @NotNull @DefensiveCopy public abstract long[] creditCards();
}