-----------------
unsafe
-----------------
	# ̫���ڵײ�İ�������������ʹ��

-----------------
����
-----------------

-----------------
type
-----------------
	type ArbitraryType int
	type Pointer *ArbitraryType
		* ������C�е� void* ����ָ��
		* �����໥�Ƚϣ����Ժ�nil���бȽ�


-----------------
method
-----------------
	func Sizeof(x ArbitraryType) uintptr
		* ����x���ڴ��еĴ�С
		* ����x�����Ǳ���ʽ�����������������Ա���ʽ��ְ

	func Offsetof(x ArbitraryType) uintptr
		
	func Alignof(x ArbitraryType) uintptr
		* ���ز���������Ҫ����ı���
	

