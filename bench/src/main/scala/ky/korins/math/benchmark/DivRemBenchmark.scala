package ky.korins.math.benchmark

import org.openjdk.jmh.annotations._

@State(Scope.Benchmark)
class DivRemBenchmark extends BaseBenchmark {
  @Param(Array("128", "512", "1024", "4096", "8192"))
  override var bits: Int = 0

  @Setup
  def setup(): Unit =
    super.setupNumbers()

  @Benchmark
  def java(): Unit = {
    javaHuge divideAndRemainder javaPrimeHalf
  }

  @Benchmark
  def scalajs(): Unit = {
    sHuge divideAndRemainder sPrimeHalf
  }

  @Benchmark
  def java_native(): Unit = {
    nHuge divideAndRemainder nPrimeHalf
  }

  @Benchmark
  def korinsky(): Unit = {
    kHuge divideAndRemainder kPrimeHalf
  }
}
