import java.util.ArrayList;

public class HandEvaluation {
	private int numOfHands;
	ArrayList<Player> active;

	public HandEvaluation(Card[] floor, Player[] p) {
		numOfHands = 0;

		for (int i = 0; i < p.length; i++) {
			if (p[i].isActive()) {
				numOfHands++;
				active.clear();
				active = new ArrayList<Player>();
				active.add(p[i]);
			}

		}

	}

	private void eval(Card[] floor, ArrayList<Player> p) {
		for (int i = 0; i < p.size(); i++) {
			if (isRoyalFlush(floor, p.get(i))) {
				p.get(i).setHandRank(10);

			} else if (isStraightFlush(floor, p.get(i))) {
				p.get(i).setHandRank(9);

			} else if (is4OfKind(floor, p.get(i))) {
				p.get(i).setHandRank(8);
			} else if (isFullHouse(floor, p.get(i))) {
				p.get(i).setHandRank(7);
			} else if (isFlush(floor, p.get(i))) {
				p.get(i).setHandRank(6);

			} else if (isStraight(floor, p.get(i))) {
				p.get(i).setHandRank(5);

			} else if (is3OfKind(floor, p.get(i))) {
				p.get(i).setHandRank(4);

			} else if (is2pair(floor, p.get(i))) {
				p.get(i).setHandRank(3);

			} else if (isPair(floor, p.get(i))) {
				p.get(i).setHandRank(2);

			} else {
				p.get(i).setHandRank(1);

			}

		}

	}

	public boolean isRoyalFlush(Card[] floor, Player p) {
		boolean flag = false;
		ArrayList<Card> ca = new ArrayList<Card>();
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		int suit = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			suit = ca.get(i).getSuit();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getSuit() == suit) {
					for (int j = i + 2; j < 7; j++) {
						if (ca.get(j).getSuit() == suit) {
							for (int n = i + 3; n < 7; n++) {
								if (ca.get(n).getSuit() == suit) {
									for (int m = i + 4; m < 7; m++) {
										if (ca.get(m).getSuit() == suit) {
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		int suit = 0;

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
												flag = true;
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
					if (ca.get(z).getRank() == 9) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 8) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 7) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 6) {
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
					if (ca.get(z).getRank() == 8) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 7) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 6) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 5) {
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
					if (ca.get(z).getRank() == 7) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 6) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 5) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 4) {
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
					if (ca.get(z).getRank() == 6) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 5) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 4) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 3) {
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
					if (ca.get(z).getRank() == 5) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 4) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 3) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 2) {
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
					if (ca.get(z).getRank() == 4) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 3) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 2) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 1) {
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
					if (ca.get(z).getRank() == 3) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 2) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 1) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 0 && ca.get(j).getSuit() == suit) {
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
					if (ca.get(z).getRank() == 2) {
						for (int m = 0; m < 7; m++) {
							if (ca.get(m).getRank() == 1) {
								for (int n = 0; n < 7; n++) {
									if (ca.get(n).getRank() == 0) {
										for (int j = 0; j < 7; j++) {
											if (ca.get(j).getRank() == 12) {
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		int rank = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					for (int j = i + 2; j < 7; j++) {
						if (ca.get(j).getRank() == rank) {
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		int rank = 0;
		int rank2 = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					for (int j = 0; j < 7; j++) {
						if (ca.get(j).getRank() != rank) {
							rank2 = ca.get(j).getRank();
							for (int m = j + 1; m < 7; m++) {
								if (ca.get(m).getRank() == rank2) {
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
		ca.add(p.getpHand()[0]);
		ca.add(p.getpHand()[1]);
		ca.add(floor[0]);
		ca.add(floor[1]);
		ca.add(floor[2]);
		int rank = 0;

		// locating
		for (int i = 0; i < 7; i++) {
			rank = ca.get(i).getRank();
			for (int z = i + 1; z < 7; z++) {
				if (ca.get(z).getRank() == rank) {
					flag = true;
					return flag;

				}
			}
		}
		return flag;
	}

	public boolean isHighCard(Card[] floor, Player p) {
		
		return true;
	}

	public Player winner(ArrayList<Player> p) {
		int max = p.get(0).getHandRank();
		int index = 0;
		for (int i = 1; i < p.size(); i++) {
			if (p.get(i).getHandRank() > max) {
				max = p.get(i).getHandRank();
				index = i;
			}

		}
		return p.get(index);

	}

}
