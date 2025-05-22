import 'package:flutter/material.dart';
import 'package:sodam/style.dart';
import '../components/bottom_nav.dart';
import '../chat/chat_page.dart';
import '../mypage/my_page.dart';

class SangajiIntroPage extends StatelessWidget {
  const SangajiIntroPage({super.key});

  void _onTabTapped(BuildContext context, int index) {
    if (index == 0) {
      Navigator.pushReplacement(
        context,
        MaterialPageRoute(builder: (_) => const ChatPage()),
      );
    } else if (index == 1) {
      // 현재 페이지 (놀이)
    } else if (index == 2) {
      Navigator.pushReplacement(
        context,
        MaterialPageRoute(builder: (_) => const MyPage()),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('놀이')),
      body: Stack(
        children: [
          Positioned.fill(
            child: Image.asset(
              'assets/sangaji.png',
              fit: BoxFit.cover,
            ),
          ),
          Align(
            alignment: Alignment.bottomCenter,
            child: Padding(
              padding: const EdgeInsets.only(bottom: 80),
              child: ElevatedButton(
                onPressed: () {
                  // 게임 시작 화면으로 이동
                },
                style: ElevatedButton.styleFrom(
                  backgroundColor: Colors.green[200],
                  padding: const EdgeInsets.symmetric(horizontal: 40, vertical: 12),
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(10),
                  ),
                ),
                child: Text('게임시작', style: startButtonTextStyle),
              ),
            ),
          ),
        ],
      ),
      bottomNavigationBar: const CustomBottomNavBar(currentIndex: 1),
    );
  }
}
