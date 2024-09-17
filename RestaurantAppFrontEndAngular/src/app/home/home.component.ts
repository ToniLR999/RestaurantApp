import { AfterViewInit, Component, OnDestroy, OnInit, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit, AfterViewInit, OnDestroy{
  private menu: HTMLElement | null = null;
  private navbar: HTMLElement | null = null;
  private scrollTopButton: HTMLElement | null = null;

  constructor(private renderer: Renderer2) {}

  ngOnInit(): void {
    // Aquí puedes obtener referencias a los elementos del DOM
    this.menu = document.querySelector('#menu-bar');
    this.navbar = document.querySelector('.navbar');
    this.scrollTopButton = document.querySelector('#scroll-top');
  }

  ngAfterViewInit(): void {
    if (this.menu && this.navbar) {
      this.renderer.listen(this.menu, 'click', () => {
        this.toggleMenu();
      });
    }

    // Escuchar el evento de scroll de la ventana
    window.addEventListener('scroll', this.onWindowScroll);

    // Ejecutar el loader al cargar la página
    this.fadeOut();
  }

  ngOnDestroy(): void {
    // Limpiar eventos cuando el componente se destruye
    window.removeEventListener('scroll', this.onWindowScroll);
  }

  toggleMenu(): void {
    if (this.menu && this.navbar) {
      this.menu.classList.toggle('fa-times');
      this.navbar.classList.toggle('active');
    }
  }

  onWindowScroll = (): void => {
    if (this.menu && this.navbar) {
      this.menu.classList.remove('fa-times');
      this.navbar.classList.remove('active');
    }

    if (window.scrollY > 60) {
      this.scrollTopButton?.classList.add('active');
    } else {
      this.scrollTopButton?.classList.remove('active');
    }
  }

  loader(): void {
    const loaderContainer = document.querySelector('.loader-container');
    if (loaderContainer) {
      loaderContainer.classList.add('fade-out');
    }
  }

  fadeOut(): void {
    setTimeout(() => this.loader(), 3000);
  }
}
