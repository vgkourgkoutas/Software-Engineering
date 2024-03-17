from kivy.app import App
from kivy.uix.gridlayout import GridLayout
from kivy.uix.label import Label
from kivy.uix.image import Image
from kivy.uix.button import Button
from kivy.uix.textinput import TextInput
from kivy.uix.screenmanager import ScreenManager, Screen, SlideTransition



class Login_Window(Screen):
   pass

class WindowManager(ScreenManager):
   pass

#kv = Builder.load_file('new_window.kv')

class start(Screen):
    def build(self):

        self.window = GridLayout()
        self.window.cols = 1

        self.window.add_widget(Image(source="techaholicslogo.png",keep_ratio=True, allow_stretch=True))

        # Δημιουργία κουμπιού Log in
        self.log = Button(text="Σύνδεση", on_press=self.change_screen,font_size=32)
        self.window.add_widget(self.log)

        return self.window
    
    def change_screen(self, instance):
        self.manager.transition.direction = 'left'
        self.manager.current = 'second'
    
class login(Screen):
    def build(self):
        self.window = GridLayout()
        self.window.cols = 1

        self.window.add_widget(Image(source="techaholicslogo.png"))
        self.username = Label(text="Χρήστης: ")
        self.window.add_widget(self.username)

        self.user = TextInput(multiline=False)
        self.window.add_widget(self.user)

        self.password = Label(text="Κωδικός: ")
        self.window.add_widget(self.password)

        self.passw = TextInput(multiline=False)
        self.window.add_widget(self.passw)

        self.button = Button(text="Είσοδος")
        self.window.add_widget(self.button)
        return self.window 
    
    def change_screen(self, instance):
        self.manager.transition.direction = 'right'
        self.manager.current = 'first'

class MyApp(App):
    def build(self):
        sm = ScreenManager()
        sm.add_widget(start(name='first'))
        sm.add_widget(login(name='second'))
        return sm



if __name__ == "__main__":
 MyApp().run()