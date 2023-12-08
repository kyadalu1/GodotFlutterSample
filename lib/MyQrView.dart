import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

const myQrView = 'myQrView';

class MyQrView extends StatelessWidget {
  const MyQrView({super.key});

  @override
  Widget build(BuildContext context) {
    return Platform.isAndroid
        ? const AndroidView(
            viewType: myQrView,
            layoutDirection: TextDirection.ltr,
            creationParams: null,
            creationParamsCodec: StandardMessageCodec(),
          )
        : const UiKitView(
            viewType: myQrView,
            layoutDirection: TextDirection.ltr,
            creationParams: null,
            creationParamsCodec: StandardMessageCodec(),
          );
  }
}
