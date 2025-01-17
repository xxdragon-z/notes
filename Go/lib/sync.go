----------------------
sync
----------------------

----------------------
变量
----------------------



----------------------
type
----------------------
	# type Cond struct {
			L Locker
		}
		func NewCond(l Locker) *Cond
		func (c *Cond) Broadcast()
		func (c *Cond) Signal()
		func (c *Cond) Wait()
	
	# type Locker interface {
			Lock()
			Unlock()
		}
	
	# type Map struct {}
		
		* 并发安全的Map
		
		func (m *Map) Delete(key interface{})
			* 删除KEY

		func (m *Map) Load(key interface{}) (value interface{}, ok bool)
			* 检索KEY，ok 表示是否存在

		func (m *Map) LoadAndDelete(key interface{}) (value interface{}, loaded bool)
			* 删除KEY，并且返回删除后的VALUE，loaded 表示KEY是否存在
			
		func (m *Map) LoadOrStore(key, value interface{}) (actual interface{}, loaded bool)
			* 如果key不存在，返回 value, false
			* 如果key已经存在，替换，返回 oldValue, true

		func (m *Map) Range(f func(key, value interface{}) bool)
			* 遍历所有KEY/VAKUE
			* 如果返回false，停止遍历
			
		func (m *Map) Store(key, value interface{})
			* 存储KEY
	
	# type Mutex struct {}
		func (m *Mutex) Lock()
		func (m *Mutex) Unlock()
		func (m *Mutex) TryLock() bool
	
	# type Once struct {}
		func (o *Once) Do(f func())
	
	# type Pool struct {
			New func() interface{} // contains filtered or unexported fields
		}

		* 对象池，用来保存和复用临时对象，以减少内存分配，降低CG压力。

		func (p *Pool) Get() interface{}
		func (p *Pool) Put(x interface{})

	
	# type RWMutex struct {}
		func (rw *RWMutex) Lock()
		func (rw *RWMutex) RLock()
		func (rw *RWMutex) RLocker() Locker
		func (rw *RWMutex) RUnlock()
		func (rw *RWMutex) TryLock() bool
		func (rw *RWMutex) TryRLock() bool
		func (rw *RWMutex) Unlock()
	
	# type WaitGroup struct {}
		func (wg *WaitGroup) Add(delta int)
		func (wg *WaitGroup) Done()
		func (wg *WaitGroup) Wait()


----------------------
方法
----------------------
	