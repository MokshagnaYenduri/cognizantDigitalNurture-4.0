export default function CourseDetails({ courses }) {
  if (!courses?.length) {
    return <p>No courses available</p>;
  }

  return (
    <div>
      <h2>Course Details</h2>
      {courses.map(course => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}
