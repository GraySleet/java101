

package com.mhisoft.matthew.learningjava.scoping;



/**
 * @author Matthew Xue
 * @since 6/30/18
 */


public class Ifmatthew {
	public static void main(String[] args) {
		int matthewYear = 2004;
		int hannaYear = 2007;
		int bellaYear = 2012;

		if (bellaYear > matthewYear) {
			//bella first
			if (bellaYear > hannaYear) {
				//bella matthew
				System.out.println("1.Bella:" + bellaYear);
				//now compare matthew and hanna
				if (matthewYear > hannaYear) {
					System.out.println("2.Matthew:" + matthewYear );
					System.out.println("3.hanna:" + hannaYear);
				} else {
					System.out.println("2.Hanna:" +hannaYear);
					System.out.println("3.matthew:" +matthewYear);
				}


			} else {

				//   bellaYear > matthewYear  and bellaYear<  hannaYear
				System.out.println("3.hanna:" + hannaYear);
				System.out.println("1.Bella:" + bellaYear);
				System.out.println("3.matthew:" +matthewYear);

			}

		} else {
			if (matthewYear > hannaYear) {
				System.out.println("1.matthew:" +matthewYear);
				if (hannaYear > bellaYear) {
					System.out.println("2.Hanna:" +hannaYear);
					System.out.println("1.Bella:" + bellaYear);
				} else {
					if (bellaYear > hannaYear) {
						System.out.println("2.Bella::" + bellaYear);
						System.out.println("3.Hanna:" +hannaYear);
					}
					else {
						System.out.println("1.Hanna:" +hannaYear);
						System.out.println("2.matthew:" +matthewYear);
						System.out.println("3.Bella::" + bellaYear);

					}


				}
				}


			}
		}
	}

