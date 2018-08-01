package Principal;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.spi.DirStateFactory.Result;

public class Principal {

	static long aCount = 0;
	static long bCount = 0;
	static long cCount = 0;
	static long dCount = 0;
	static long eCount = 0;
	static long fCount = 0;
	static long gCount = 0;
	static long hCount = 0;
	static long iCount = 0;
	static long jCount = 0;
	static long kCount = 0;
	static long lCount = 0;
	static long mCount = 0;
	static long nCount = 0;
	static long oCount = 0;
	static long pCount = 0;
	static long qCount = 0;
	static long rCount = 0;
	static long sCount = 0;
	static long tCount = 0;
	static long uCount = 0;
	static long vCount = 0;
	static long wCount = 0;
	static long xCount = 0;
	static long yCount = 0;
	static long zCount = 0;

	public static void main(String[] args) throws IOException,
			InterruptedException {

		Date inicio = new Date();

		final String ignorar = " :;)(1234567890,._'%-$/[]\"";
		final String as = "aáàâãä";
		final String bs = "b";
		final String cs = "cç";
		final String ds = "d";
		final String es = "eéèê";
		final String fs = "f";
		final String gs = "g";
		final String hs = "h";
		final String is = "ií";
		final String js = "j";
		final String ks = "k";
		final String ls = "l";
		final String ms = "m";
		final String ns = "n";
		final String os = "oóòõô";
		final String ps = "p";
		final String qs = "q";
		final String rs = "r";
		final String ss = "s";
		final String ts = "t";
		final String ws = "w";
		final String xs = "x";
		final String ys = "y";
		final String zs = "z";
		final String us = "uúùü";
		final String vs = "v";

		// File("C:/Users/diogo/Google Drive/Faculdade/5º Período/Programação V/1º Bimestre/Atividade1-Amostra/Amostra");
		File folder = new File(
				"C:/Users/diogo/Google Drive/Faculdade/5º Período/Programação V/1º Bimestre/Atividade1-Producao/Producao");
		File[] files = folder.listFiles();

		ExecutorService exec = Executors.newFixedThreadPool(4);

		try {
			for (final File file : files) {
				exec.submit(new Runnable() {
					public void run() {
						String conteudo = GerenciadorArquivos.ler(file
								.getAbsolutePath());

						for (int i = 0; i < conteudo.length(); i++) {
							//if (ignorar.indexOf(conteudo.charAt(i)) > -1)
							//	continue;
							if (as.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									aCount++;
								}
							} else if (bs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									bCount++;
								}
							} else if (cs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									Principal.cCount++;
								}
							} else if (ds.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									Principal.dCount++;
								}
							} else if (es.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									Principal.eCount++;
								}
							} else if (fs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									fCount++;
								}
							} else if (gs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									gCount++;
								}
							} else if (hs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									hCount++;
								}
							} else if (is.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									iCount++;
								}
							} else if (js.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									jCount++;
								}
							} else if (ks.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									kCount++;
								}
							} else if (ls.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									lCount++;
								}
							} else if (ms.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									mCount++;
								}
							} else if (ns.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									nCount++;
								}
							} else if (os.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									oCount++;
								}
							} else if (ps.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									pCount++;
								}

							} else if (qs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									qCount++;
								}
							} else if (rs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									rCount++;
								}
							} else if (ss.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									sCount++;
								}
							} else if (ts.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									tCount++;
								}
							} else if (us.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									uCount++;
								}
							} else if (vs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									vCount++;
								}
							} else if (xs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									xCount++;
								}
							} else if (ws.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									wCount++;
								}
							} else if (ys.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									yCount++;
								}
							} else if (xs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									xCount++;
								}
							} else if (zs.indexOf(conteudo.charAt(i)) > -1) {
								synchronized (Principal.class) {
									zCount++;
								}
							}
						}
					}
				});
			}
		} catch (Exception e) {
			exec.shutdown();
			System.out.println("DEU ERRO !!!");
			System.out.println(e.getStackTrace());
		}

		// System.out.println(j);

		exec.shutdown();
		exec.awaitTermination(Long.MAX_VALUE, TimeUnit.MICROSECONDS);

		System.out.println("A: " + aCount);
		System.out.println("B: " + bCount);
		System.out.println("C: " + cCount);
		System.out.println("D: " + dCount);
		System.out.println("E: " + eCount);
		System.out.println("F: " + fCount);
		System.out.println("G: " + gCount);
		System.out.println("H: " + hCount);
		System.out.println("I: " + iCount);
		System.out.println("J: " + jCount);
		System.out.println("K: " + kCount);
		System.out.println("L: " + lCount);
		System.out.println("M: " + mCount);
		System.out.println("N: " + nCount);
		System.out.println("O: " + oCount);
		System.out.println("P: " + pCount);
		System.out.println("Q: " + qCount);
		System.out.println("R: " + rCount);
		System.out.println("S: " + sCount);
		System.out.println("T: " + tCount);
		System.out.println("U: " + uCount);
		System.out.println("V: " + vCount);
		System.out.println("W: " + wCount);
		System.out.println("X: " + xCount);
		System.out.println("Y: " + yCount);
		System.out.println("Z: " + zCount);

		Date fim = new Date();
		System.out.println(fim.getTime() - inicio.getTime());
	}

}
