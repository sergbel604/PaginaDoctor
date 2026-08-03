package com.portfolio.service;

import com.portfolio.model.Person;
import com.portfolio.model.Experience;
import com.portfolio.model.Project;
import com.portfolio.model.Skill;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ProfileService {

        public Person getProfileData() {
                Person person = new Person();
                person.setName("Dr. Sergio Beltrán");
                person.setTitle("Médico Cirujano y Nefrólogo");
                person.setAbout(
                                "¡Hola! Soy médico cirujano especializado en nefrología y ecografía diagnóstica. Mi pasión es cuidar la salud de tus riñones y vías urinarias de la forma más cercana y empática. Realizo estudios detallados como ecografías (renales, vesicales, prostáticas, abdominales y Doppler), y te acompaño paso a paso con un seguimiento integral y súper amigable en cualquier patología. ¡Tu bienestar es mi prioridad!");

                person.setSkills(Arrays.asList(
                                new Skill("Evaluación Nefrológica Integral",
                                                "Enfermedades del riñón, diálisis y transplante renal."),
                                new Skill("Estudios Ecográficos",
                                                "Abdomen, renal, ginecológico, prostático, obstétricos, tiroides, partes blandas, hombro, codo, mano, rodillas, talón y pies."),
                                new Skill("Doppler Vascular y Especializado",
                                                "Doppler arterial y venoso en miembros superiores e inferiores. Doppler renal, Doppler del sistema portal, Doppler carotídeo, Doppler testicular y Doppler obstétrico."),
                                new Skill("Fístulas AV y Punciones Ecoguiadas",
                                                "Evaluación prefístula AV, evaluación de fístulas AV. Punciones ecoguiadas incluyendo colocación de catéteres, evaluación de piel y anexos."),
                                new Skill("Medicina Estética Integral",
                                                "Evaluación y tratamientos estéticos integrales faciales y corporales. Rejuvenecimiento facial y corporal. Armonización facial."),
                                new Skill("Armonización y Bioestimulación",
                                                "Toxina botulínica, plasma rico en plaquetas, aplicación de bioestimuladores y exosomas."),
                                new Skill("Tratamientos Médicos con Láser",
                                                "Rejuvenecimiento, estrías, eliminación de lesiones en piel, varicosidades y telangiectasias. Tratamiento de varicosidades superficiales (láser y escleroterapia, incluyendo escleroterapia ecoguiada)."),
                                new Skill("Alopecia y Control de Obesidad",
                                                "Tratamiento avanzado de la alopecia. Evaluación y tratamiento integral de la obesidad.")));

                Experience exp1 = new Experience("Médico Cirujano",
                                "Universidad de Los Andes",
                                "Graduado en Octubre de 1985",
                                "Formación integral en medicina general, cirugía, y atención clínica centrada en el paciente de forma muy humana y cercana.",
                                "/img/TituloMedico.jpeg");

                Experience exp2 = new Experience("Especialidad en Nefrología",
                                "Universidad de Ciencias Médicas",
                                "Graduado en Diciembre de 1991",
                                "Estudios avanzados en el diagnóstico y tratamiento de enfermedades renales y del tracto urinario.",
                                "/img/TituloNefrologo.jpeg");

                Experience exp3 = new Experience("Especialidad en Ultrasonido / Ecografía",
                                "Unidad de Perinatologia del Hospital Universitario de Caracas",
                                "Graduado en Agosto de 1993",
                                "Especialización en ecografía diagnóstica integral, abarcando estudios renales, vesicales, prostáticos, abdominales y Doppler.",
                                "/img/TituloUltrasonido.jpeg");

                Experience exp4 = new Experience("Especialidad en Doppler Color",
                                "Centro Docente de Estudios Clinicos-Imageneológico",
                                "Graduado en Abril 1994",
                                "Formación especializada en ecografía Doppler Color para el estudio del flujo sanguíneo y evaluación vascular detallada.",
                                "/img/TituloDopplerColor.jpeg");

                Experience exp6 = new Experience("Especialidad en Obstetricia y Ginecología",
                                "Departamente de Obstretricia y Ginecología Universidad de Carabobo",
                                "Graduado en Julio de 1999",
                                "Formación integral en ecografía y cuidados orientados a la salud de la mujer y seguimiento del desarrollo fetal.",
                                "/img/TituloObstetriciaGinecologia.jpeg");

                Experience exp8 = new Experience("Especialidad en Tecnología Láser",
                                "Instituto Dermatoestético Láser Universidad de Carabobo",
                                "Graduado en Julio 2010",
                                "Formación en el uso de tecnología láser de vanguardia para tratamientos médicos y dermatológicos.",
                                "/img/TituloLaser.jpeg");

                Experience exp10 = new Experience("Especialidad en Estética Facial",
                                "Fundación Centro de Estudios de Medicina Estética",
                                "Graduado en Julio 2014",
                                "Formación avanzada en rejuvenecimiento, armonización facial integral, toxina botulínica y bioestimuladores.",
                                "/img/facial_1.jpg");

                Experience exp5 = new Experience("Especialidad en Ecografía Musculoesquelética",
                                "Centro Docente de Ultrasonido en Medicina Colegio de Médicos de Carabobo",
                                "Graduado en Diciembre 2014",
                                "Estudios enfocados en la evaluación por ultrasonido de músculos, tendones, ligamentos y articulaciones.",
                                "/img/TituloMusculoEsqueletica.jpeg");

                Experience exp9 = new Experience("Especialidad en Estética Corporal",
                                "Fundación Centro de Estudios de Medicina Estética",
                                "Graduado en Abril 2015",
                                "Formación y especialización en tratamientos estéticos corporales, remodelación y cuidado integral del contorno corporal.",
                                "/img/corporal_1.jpg");

                Experience exp11 = new Experience("Especialidad en Metabolismo y Obesidad",
                                "Fundación Centro de Estudios de Medicina Estética",
                                "Graduado en Febrero de 2016",
                                "Formación en manejo clínico y tratamiento integral del metabolismo, control de peso y abordaje de la obesidad.",
                                "/img/metabolismo_1.jpg");

                Experience exp7 = new Experience("Especialidad en Medicina Estética",
                                "Unión Internacionale de Medicine Esthetique París",
                                "Graduado en Julio 2016",
                                "Capacitación avanzada en procedimientos estéticos para el cuidado integral y rejuvenecimiento.",
                                "/img/TituloEstetica.jpeg");

                person.setExperiences(
                                Arrays.asList(exp1, exp2, exp3, exp4, exp6, exp8, exp10, exp5, exp9, exp11, exp7));

                Project clinica1 = new Project("Clínica Merced",
                                "Atención médica especializada en Nefrología, Ecografía diagnóstica integral (renales, abdominales, Doppler) y Medicina Estética. Evaluación clínica exhaustiva y control integral con acompañamiento personalizado.",
                                "Nefrología • Ecografía • Estética",
                                "https://clinicamerced.cl/reserva-tu-hora-nefrologia/");
                Project clinica2 = new Project("Medipro",
                                "Centro médico con atención en Nefrología, estudios de Ecografía especializada (Doppler, punciones ecoguiadas) y tratamientos de Medicina Estética. Cuidado integral y diagnóstico con tecnología de vanguardia.",
                                "Nefrología • Ecografía • Estética", "https://medipro.cl/agendar-cita/");
                Project clinica3 = new Project("Clínica Bandera",
                                "Consultas especializadas en Nefrología para salud renal, estudios completos de Ecografía diagnóstica y procedimientos de Medicina Estética con seguimiento continuo y empático para tu bienestar.",
                                "Nefrología • Ecografía • Estética",
                                "https://centromedicobandera.cl/consulta-dermatologica/");
                person.setProjects(Arrays.asList(clinica1, clinica2, clinica3));

                return person;
        }
}
