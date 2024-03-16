from kivy.app import App
from kivy.uix.gridlayout import GridLayout
from kivy.uix.label import Label
from kivy.uix.image import Image
from kivy.uix.button import Button
from kivy.uix.textinput import TextInput

class start(App):
    def build(self):
        self.window = GridLayout()
        self.window.cols = 1

        self.window.add_widget(Image(source="techaholicslogo.png"))

        self.log = Button(text="Σύνδεση", font_size=32)
        self.window.add_widget(self.log)

        self.sign = Button(text="Εγγραφή", font_size=32)
        self.window.add_widget(self.sign)

        return self.window




if __name__ == "__main__":
 start().run()