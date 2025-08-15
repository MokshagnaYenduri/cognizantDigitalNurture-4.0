import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";

export default function App() {
  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/12/2021" },
  ];

  const books = [
    { id: 1, name: "Master React", price: 670 },
    { id: 2, name: "Deep Dive into Angular 11", price: 800 },
    { id: 3, name: "Mongo Essentials", price: 450 },
  ];

  const blogs = [
    { id: 1, title: "React Learning", author: "Stephen Biz", content: "Welcome to learning React!" },
    { id: 2, title: "Installation", author: "Schwedenizer", content: "You can install React from npm." }
  ];

  const showCourses = true;
  const showBooks = true;
  const showBlogs = true;

  return (
    <div style={{ display: "flex", justifyContent: "space-around", marginTop: "50px" }}>
      
      {/* Conditional Rendering: Logical AND */}
      {showCourses && <CourseDetails courses={courses} />}

      {/* Conditional Rendering: Ternary Operator */}
      {showBooks ? <BookDetails books={books} /> : <p>Books hidden</p>}

      {/* Conditional Rendering: IIFE */}
      {(() => {
        if (showBlogs) {
          return <BlogDetails blogs={blogs} />;
        } else {
          return <p>Blogs are disabled</p>;
        }
      })()}
    </div>
  );
}
