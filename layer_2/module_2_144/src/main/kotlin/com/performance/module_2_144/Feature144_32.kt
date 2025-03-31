package com.performance.module_2_144

class Feature144UseCase0(
    private val repository: Feature144Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
