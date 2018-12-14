import java.util.ArrayList;
import java.util.Comparator;

public class HandEvaluation {
	private int numOfHands;
	ArrayList<Player> active;

	public HandEvaluation(Card[] floor, Player[] p) {
		numOfHands = 0;

		for (int i = 0; i < p.length; i++) {
			if (p[i].isActive()) {
				numOfHands++;
				//active.clear();
				active = new ArrayList<Player>();
				active.add(p[i]);
			}

		}
		this.eval(floor, active);

	}

	private void eval(Card[] floor, ArrayList<Player> p) {
		for (int i = 0; i < p.size(); i++) {
			if (isRoyalFlush(floor, p.get(i))) {

			} else if (isStraightFlush(floor, p.get(i))) {

			} else if (is4OfKind(floor, p.get(i))) {

			} else if (isFullHouse(floor, p.get(i))) {

			} else if (isFlush(floor, p.get(i))) {

			} else if (isStraight(floor, p.get(i))) {

			} else if (is3OfKind(floor, p.get(i))) {

			} else if (is2pair(floor, p.get(i))) {

			} else if (isPair(floor, p.get(i))) {

			} else {
				isHighCard(floor, p.get(i));

			}

		}

	}

	public boolean isRoyalFlush(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int suit = 0;

		// locating Ace
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 12) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 11 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 10 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 9 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 8 && ca.get(j).getSuit() == suit) {
												flag = true;
												p.setHandRank(10);

											}
										}

									}
								}

							}
						}
					}

				}
			}

		}
		return flag;

	}

	public boolean isStraightFlush(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int suit = 0;
		// locating King
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 11) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 10 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 9 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 8 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 7 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(10);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating Queen
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 10) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 9 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 8 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 7 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 6 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(9);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating Jack
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 9) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 8 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 7 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 6 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 5 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(8);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 10
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 8) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 7 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 6 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 5 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 4 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(7);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 9
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 7) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 6 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 5 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 4 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 3 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(6);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 8
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 6) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 5 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 4 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 3 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 2 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(5);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}
		// locating 7
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 5) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 4 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 3 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 2 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 1 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(4);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 6
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 4) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 3 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 2 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 1 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 0 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(3);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 5
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 3) {
				suit = ca.get(i).getSuit();
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 2 && ca.get(z).getSuit() == suit) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 1 && ca.get(m).getSuit() == suit) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 0 && ca.get(n).getSuit() == suit) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 12 && ca.get(j).getSuit() == suit) {
												p.setHandRank(9);
												p.setHandMiniRank(2);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}
		return flag;

	}

	public boolean is4OfKind(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int rank = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					for (int j = i + 2; j < 7; j++) {
						if (ca.get(j).getRank() == rank) {
							for (int n = i + 3; n < 7; n++) {
								if (ca.get(n).getRank() == rank) {
									p.setHandRank(8);
									p.setHandMiniRank(rank);
									flag = true;
									return flag;

								}

							}

						}

					}

				}

			}
		}

		return flag;
	}

	public boolean isFullHouse(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int rank = 0;
		int rank2 = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					for (int j = i + 2; j < 7; j++) {
						if (ca.get(j).getRank() == rank) {
							for (int n = 0; n < 7; n++) {
								if (ca.get(n).getRank() != rank) {
									rank2 = ca.get(n).getRank();
									for (int m = n + 1; m < 7; m++) {
										if (ca.get(m).getRank() == rank2) {
											p.setHandRank(7);
											p.setHandMiniRank(rank);
											p.setHandMiniRank2(rank2);
											flag = true;
											return flag;

										}

									}

								}

							}

						}

					}

				}

			}
		}

		return flag;
	}

	public boolean isFlush(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int suit = 0;
		int rank = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			suit = ca.get(i).getSuit();
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getSuit() == suit) {
					for (int j = i + 2; j < 7; j++) {
						if (ca.get(j).getSuit() == suit) {
							for (int n = i + 3; n < 7; n++) {
								if (ca.get(n).getSuit() == suit) {
									for (int m = i + 4; m < 7; m++) {
										if (ca.get(m).getSuit() == suit) {
											p.setHandRank(6);
											p.setHandMiniRank(rank);

											flag = true;
											return flag;

										}

									}

								}

							}

						}

					}

				}

			}
		}

		return flag;
	}

	public boolean isStraight(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);

		// locating Ace
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 12) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 11) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 10) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 9) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 8) {
												p.setHandRank(5);
												p.setHandMiniRank(10);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating King
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 11) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 10) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 9) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 8) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 7) {
												p.setHandRank(5);
												p.setHandMiniRank(9);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating Queen
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 10) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 9) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 8) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 7) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 6) {
												p.setHandRank(5);
												p.setHandMiniRank(8);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating Jack
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 9) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 8) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 7) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 6) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 5) {
												p.setHandRank(5);
												p.setHandMiniRank(7);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 10
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 8) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 7) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 6) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 5) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 4) {
												p.setHandRank(5);
												p.setHandMiniRank(6);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 9
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 7) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 6) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 5) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 4) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 3) {
												p.setHandRank(5);
												p.setHandMiniRank(5);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 8
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 6) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 5) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 4) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 3) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 2) {
												p.setHandRank(5);
												p.setHandMiniRank(4);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}
		// locating 7
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 5) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 4) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 3) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 2) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 1) {
												p.setHandRank(5);
												p.setHandMiniRank(3);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 6
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 4) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 3) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 2) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 1) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 0) {
												p.setHandRank(5);
												p.setHandMiniRank(2);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}

		// locating 5
		for (int i = 0; i < 7; i++) {
			if (ca.get(i).getRank() == 3) {
				for (int z = 0; z < 7; z++) {
					if (ca.get(z).getRank() == 2) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 1) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 0) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 12) {
												p.setHandRank(5);
												p.setHandMiniRank(1);
												flag = true;
												return flag;
											}
										}

									}
								}

							}
						}
					}

				}
			}

		}
		return flag;
	}

	public boolean is3OfKind(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int rank = 0;
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		int highCard1 = 0;
		int highCard2 = 0;
		int max = 0;
		int temp = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			rank = ca.get(i).getRank();
			index1 = i;
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					index2 = z;
					for (int j = i + 2; j < 7; j++) {
						if (ca.get(j).getRank() == rank) {
							index3 = j;
							p.setHandRank(4);
							p.setHandMiniRank(rank);
							for (int jj = 0; jj < 7 && jj != index1 && jj != index2 && jj != index3; jj++) {
								temp = ca.get(jj).getRank();
								if(temp > max){
									max = temp;
									highCard1 = max;
									p.setHandMiniRank2(highCard1);
									
								}
								else {
									highCard2 = temp;
									p.setHandMiniRank3(highCard2);
									
								}
								
							}
							flag = true;
							return flag;
						}

					}

				}

			}
		}

		return flag;
	}

	public boolean is2pair(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int rank = 0;
		int rank2 = 0;
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;
		int highCard = 0;
		

		// locating
		for (int i = 0; i < 7; i++) {
			rank = ca.get(i).getRank();
			index1 = i;
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					index2 = z;
					for (int j = 0; j < 7; j++) {
						if (ca.get(j).getRank() != rank) {
							index3 = j;
							rank2 = ca.get(j).getRank();
							for (int m = j + 1; m < 7; m++) {
								if (ca.get(m).getRank() == rank2) {
									index4 = m;
									p.setHandRank(3);
									p.setHandMiniRank(rank);
									
									for (int jj = 0; jj < 7 && jj != index1 && jj != index2 && jj != index3 && jj != index4; jj++) {
										highCard = ca.get(jj).getRank();
										p.setHandMiniRank2(highCard);
									}
									flag = true;
									return flag;

								}
							}
						}
					}

				}
			}
		}
		return flag;
	}

	public boolean isPair(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int rank = 0;
		int index1 = 0;
		int index2 = 0;
		int highCard1 = 0;
		int highCard2 = 0;
		int highCard3 = 0;
		int temp = 0;
		int max1 = 0;
		int max2 = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			index1 = i;
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					index2 = z;
					p.setHandRank(2);
					p.setHandMiniRank(rank);
					for (int jj = 0; jj < 7 && jj != index1 && jj != index2; jj++) {
						temp = ca.get(jj).getRank();
						if(temp > max1){
							max2 = max1;
							max1 = temp;
							highCard1 = max1;
							highCard2 = max2;
							p.setHandMiniRank2(highCard1);
							p.setHandMiniRank3(highCard2);
							
						}
						else {
							highCard3 = temp;
							p.setHandMiniRank4(highCard3);
							
						}
						
					}
					flag = true;
					return flag;

				}
			}
		}
		return flag;
	}

	public boolean isHighCard(Card[] floor, Player p) {

		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpCard1());
		ca.add(p.getpCard2());
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		ca.add(floor[3]);
		ca.add(floor[4]);
		int rank = 0;
		int index1 = 0;
		int index2 = 0;
		int highCard1 = 0;
		int highCard2 = 0;
		int highCard3 = 0;
		int temp = 0;
		int max1 = 0;
		int max2 = 0;
		
		p.setHandRank(1);
		ca.sort(Comparator.comparingInt(Card::getRank));
		p.setHandMiniRank(ca.get(6).getRank());
		p.setHandMiniRank2(ca.get(5).getRank());
		p.setHandMiniRank3(ca.get(4).getRank());
		p.setHandMiniRank4(ca.get(3).getRank());
		p.setHandMiniRank5(ca.get(2).getRank());

		// locating
		for (int i = 0; i < 7; i++) {
			index1 = i;
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					index2 = z;
					p.setHandRank(2);
					p.setHandMiniRank(rank);
					for (int jj = 0; jj < 7 && jj != index1 && jj != index2; jj++) {
						temp = ca.get(jj).getRank();
						if(temp > max1){
							max2 = max1;
							max1 = temp;
							highCard1 = max1;
							highCard2 = max2;
							p.setHandMiniRank2(highCard1);
							p.setHandMiniRank3(highCard2);
							
						}
						else {
							highCard3 = temp;
							p.setHandMiniRank4(highCard3);
							
						}
						
					}
					flag = true;
					return flag;

				}
			}
		}
		return flag;
	}

	public Player winner(Player[] p) {
		int numWinner = 0;
		int max = 0;
		int index = 0;
		int numWinner2 = 0;
		int numWinner3 = 0;
		int numWinner4 = 0;
		ArrayList<Player> winners = new ArrayList<Player>();
		for (int i = 0; i < p.length; i++) {
			if (p[i].getHandRank() >= max) {
				numWinner++;
				winners.add(p[i]);
				max = p[i].getHandRank();
				index = i;
			}

		}
		if(numWinner > 1){
			
			int max2 = 0;
			ArrayList<Player> winners2 = new ArrayList<Player>();
			for(int j = 0 ; j > winners2.size() ; j++){
				if (p[j].getHandMiniRank() >= max2){
					numWinner2++;
					winners2.add(p[j]);
					max2 = p[j].getHandMiniRank();
					index = j;
				}
				
			}
			
		}
		if(numWinner2 > 1){
			int max3 = 0;
			ArrayList<Player> winners3 = new ArrayList<Player>();
			for(int j = 0 ; j > winners3.size() ; j++){
				if (p[j].getHandMiniRank2() >= max3){
					numWinner3++;
					winners3.add(p[j]);
					max3 = p[j].getHandMiniRank2();
					index = j;
				}
				
			}
			
		}
		if(numWinner3 > 1){
			int max4 = 0;
			ArrayList<Player> winners4 = new ArrayList<Player>();
			for(int j = 0 ; j > winners4.size() ; j++){
				if (p[j].getHandMiniRank3() >= max4){
					numWinner4++;
					winners4.add(p[j]);
					max4 = p[j].getHandMiniRank3();
					index = j;
				}
				
			}
			
		}
		return p[index];

	}

}
