package com.performance.module_2_202

class Feature202UseCase2(
    private val repository: Feature202Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
